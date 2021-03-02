package 面试题婴儿名字;

import java.util.*;

//class Solution {
//    class Name{
//        private String name;
//        private String father;
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getFather() {
//            return father;
//        }
//
//        public void setFather(String father) {
//            this.father = father;
//        }
//    }
//    public String[] trulyMostPopular(String[] names, String[] synonyms) {
//
//        Map<String,Integer>map = new HashMap<>();
//
//        Set<String>strings = new HashSet<>();
//
//        List<String> fathers = new ArrayList<>();
//
//        List<Name> nameList = new ArrayList<>();
//
//
//        //怎么确定名字的祖宗，
//        //查找重复的元素
//
//        for (String string:synonyms){
//            int index = string.indexOf(',');
//            String name1 = string.substring(1,index);
//            String name2 = string.substring(index+1,string.length()-1);
//
//            //判断是否是重复元素，即父亲元素
//            if(!strings.add(name1)){
//                fathers.add(name1);
//            }
//            if(!strings.add(name2)){
//                fathers.add(name2);
//            }
//        }
//
//        for (String string:synonyms){
//            Name name = new Name();
//            int index = string.indexOf(',');
//            String name1 = string.substring(1,index);
//            String name2 = string.substring(index+1,string.length()-1);
//
//            Iterator<String> iterator = fathers.iterator();
//            while(iterator.hasNext()){
//                //如果name1是父亲元素
//                if (name1.equals(iterator.next())){
//                    name.setName(name2);
//                    name.setFather(name1);
//                    break;
//                }
//                //如果name2是父亲元素
//                else{
//                    name.setName(name1);
//                    name.setFather(name2);
//                }
//            }
//            nameList.add(name);
//        }
//
//        //将名字出现的频率储存起来
//        for (String string:names){
//
//            int index = string.indexOf('(');
//
//            String name = string.substring(0,index);
//
//            Integer num = Integer.valueOf(string.substring(index+1,string.length()-1));
//
//            for (String s : fathers) {
//                if (name.equals(s)) {
//                    //如果map里面还没有该键值，就添加
//                    if (!map.containsKey(name)) {
//                        map.put(s, num);
//                        break;
//                    }
//                    //有就将键对应的值增加
//                    else {
//                        map.put(s, map.get(s) + num);
//                        break;
//                    }
//                }
//            }
//
//            for (Name person:nameList){
//                if(name.equals(person.getName())){
//                    //如果map里面还没有该键值，就添加
//                    if(!map.containsKey(person.getFather())){
//                        map.put(person.getFather(),num);
//                    }
//                    //有就将键对应的值增加
//                    else{
//                        map.put(person.getFather(),map.get(person.getFather())+num);
//                    }
//                }
//            }
//        }
//        String[] res = new String[fathers.size()];
//        int index = 0;
//        for (String name:fathers){
//            StringBuilder sb = new StringBuilder(name);
//            sb.append('(');
//            sb.append(map.get(name));
//            sb.append(')');
//            res[index++] = sb.toString();
//        }
//        return res;
//    }
//}

class Solution {
    public String[] trulyMostPopular(String[] names, String[] synonyms) {

        Map<String,Integer>countMap = new HashMap<>();

        Map<String,String>fatherMap = new HashMap<>();

        for (String string:names){
            int index = string.indexOf('(');
            String name = string.substring(0,index);
            Integer num = Integer.parseInt(string.substring(index+1,string.length()-1));
            countMap.put(name,num);
        }
        for (String string:synonyms){
            int index = string.indexOf(',');
            String name1 = string.substring(1,index);
            String name2 = string.substring(index+1,string.length()-1);

            //树的结构
            //这里直到递归到叶子节点结束
            while (fatherMap.containsKey(name1)) {   //找name1祖宗
                name1 = fatherMap.get(name1);
            }

            while (fatherMap.containsKey(name2)) {   //找name2祖宗
                name2 = fatherMap.get(name2);
            }

            if(!name1.equals(name2)){   //祖宗不同，要合并
                int frequency = countMap.getOrDefault(name1, 0) + countMap.getOrDefault(name2, 0);    //出现次数是两者之和
                String trulyName = name1.compareTo(name2) < 0 ? name1 : name2;
                String nickName = name1.compareTo(name2) < 0 ? name2 : name1;
                fatherMap.put(nickName, trulyName);      //小名作为大名的分支，即大名是小名的祖宗
                countMap.remove(nickName);       //更新一下数据
                countMap.put(trulyName, frequency);
            }
        }

        String[] res = new String[countMap.size()];
        int index = 0;
        for (String name : countMap.keySet()) {
            StringBuilder sb = new StringBuilder(name);
            sb.append('(');
            sb.append(countMap.get(name));
            sb.append(')');
            res[index++] = sb.toString();
        }
        return res;
    }
}

//字符串相等，返回0
//字符串大于，返回正数
//字符串小于，返回负数
public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] names = new String[]{"John(15)","Jon(12)","Chris(13)","Kris(4)","Christopher(19)"};
        String[] synonyms = new String[]{"(Jon,John)","(John,Johnny)","(Chris,Kris)","(Chris,Christopher)"};
        String[] strings = solution.trulyMostPopular(names,synonyms);
        System.out.println(Arrays.toString(strings));
    }
}