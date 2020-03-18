package Project.Study.Car_and_Person;

class Car{
    private String brand;
    private int price;
    private String person;

    public Car(String brand,int price,String person){
        this.brand=brand;
        this.price=price;
        this.person=person;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getPerson() {
        return person;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPerson(String person) {
        this.person = person;
    }
    public String getInfo(){
        return brand+",价格："+price+",车主："+person;
    }
}
class Person{
    private String name;
    private int age;
    private Car car;

    public Person(String name,int age,Car car){
        this.name=name;
        this.age=age;
        this.car=car;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo(){
        return "姓名："+name+",年龄："+age+",车辆："+car.getInfo();
    }
}
public class project1 {
    public static void main(String args[]){
        Car c1=new Car("雪佛兰",1000000,"小关");
        Person p1=new Person("小关",19,c1);
        System.out.println(p1.getInfo());
    }
}
