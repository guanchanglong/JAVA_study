class Person{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
class Student extends Person{   //Student类继承了Person类
    private String school;  //子类扩充的属性
    public void setSchool(String school){   //扩充的方法
        this.school=school;
    }
    public String getSchool(){     //扩充的方法
        return this.school;
    }
}
public class Test1_1_3_3 {
    public static void main(String args[]){
        Student stu=new Student();  //实例化的是子类
        stu.setName("小关");  //Person类定义
        stu.setAge(19);
        stu.setSchool("西安邮电大学");    //Student类扩充方法
        System.out.println("姓名："+stu.getName()+",年龄："+stu.getAge()+",学校："+stu.getSchool());
    }
}
