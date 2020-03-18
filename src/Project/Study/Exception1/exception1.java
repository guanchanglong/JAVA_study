package Project.Study.Exception1;

class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex=sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "姓名:"+name+",年龄:"+age+",性别:"+sex;
    }
}

class AgeException extends Exception{
    public AgeException(String Age){
        super(Age);
    }
}
class SexException extends Exception{
    public SexException(String Sex){
        super(Sex);
    }
}

public class exception1 {
    public static void main(String args[]){
        Person person[]=new Person []{
                new Person("小欢",2000,"男"),
                new Person("小蓝",-19,"男"),
                new Person("小梁",19,"外星人"),
                new Person("小关",190,"男"),
                new Person("小红",20,"女")};
        int y=0;
        for(int x=0;x<person.length;x++){
            try{
                if(person[x].getAge()>100){
                     throw new AgeException("年龄过大");
                }
                else if(person[x].getAge()<0){
                    throw new AgeException("年龄过小");
                }
                y=0;
                if (person[x].getSex().equals("男")||person[x].getSex().equals("女")){
                    y++;
                }
                if(y==0){
                    throw new SexException("性别异常");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
