interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("吃苹果");
    }
}
class Orange implements Fruit{
    public void eat(){
        System.out.println("吃橘子");
    }
}
class Factory{
    public static Fruit getInstance(String className){
        if ("apple".equals(className)){
            return new Apple();
        }
        else if("orange".equals(className)){
            return new Orange();
        }
        else{
            return null;
        }
    }
}
public class Test1_1_4_4 {
    public static void main(String args[]){
        Fruit f=Factory.getInstance("orange");
        f.eat();
    }
}
