package Project.Study.List;

import java.util.Comparator;
import java.util.Arrays;

class Person {
    private String name;
    private int age;
    private int income;

    public Person(String name,int age,int income){
        this.name = name;
        this.age = age;
        this.income=income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    //重写Student类的toString()方法，在输入对象时按照以下方式输出
    public String toString() {
        return "姓名:"+name+",年龄:"+age+",月收入:"+income;
    }
}

public class list {
    public static void main(String[] args) {
        Person[] ArrayList = new Person[6];
        ArrayList[0] =new Person("小红",12,8845);
        ArrayList[1] =new Person("小白",16,8012);
        ArrayList[2] =new Person("小辉",14,6821);
        ArrayList[3] =new Person("小关",20,9834);
        ArrayList[4] =new Person("小梁",18,9920);
        ArrayList[5]=new Person("小欢",19,4335);
        System.out.println("排序前的数据：");
        for(int i=0;i<ArrayList.length;i++)
            System.out.println(ArrayList[i]);
        /*for (Person person:persons) {
            System.out.println(person);
        }*/
        //创建SortByIncome对象，将其作为参数传入Arrays.sort(persons,sortByIncome)方法中
        /*SortByIncome sortByIncome = new SortByIncome();
        Arrays.sort(ArrayList,sortByIncome);
        System.out.println("根据月收入由低到高排序：");
        for(int i=0;i<ArrayList.length;i++)
            System.out.println(ArrayList[i]);
            */
        SortByIncome sortByIncome = new SortByIncome();
        //Arrays.sort(int[] a, int fromIndex, int toIndex)
        //这种形式是对数组部分排序，也就是对数组a的下标从fromIndex到toIndex-1的元素排序，注意：下标为toIndex的元素不参与排序哦！
        //public static void sort(T[] a,int fromIndex,int toIndex, Comparator c)
        //这里牵扯到了Java里面的泛型
        Arrays.sort(ArrayList,sortByIncome);
        System.out.println("根据月收入由高到低排序：");
        for(int i=0;i<ArrayList.length;i++)
            System.out.println(ArrayList[i]);
        /*for (Person person:persons) {
            System.out.println(person);
        }*/
    }

}

//按照收入由低到高排列,创建SortByIncome类，该类实现Comparator，重写该接口的compare()
/*class SortByIncome implements Comparator<Person>{
    //重写该接口的compare()使其按照收入由小到大排序（前者减去后者）
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getIncome()-o2.getIncome();

    }
}*/

//按照收入由高到低排列
class SortByIncome implements Comparator<Person>{
    //重写该接口的compare()使其按照收入由高到低排序(后者减去前者)
    public int compare(Person o1, Person o2) {
        return o2.getIncome()-o1.getIncome();
    }
}


/*2.List排序
        有Person类，属性为：姓名、龄、收入。
        New至少5个数据不同的Person将其放入ArrayList中，并分别根据收入和年龄降序排序（调用库函数使用比较器(Comparator)方式排序，不允许自己写冒泡排序之类的）。*/