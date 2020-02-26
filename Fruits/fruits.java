package Project.Study.Fruits;

interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("我正在吃Apple");
    }
}
class Origin implements Fruit{
    public void eat(){
        System.out.println("我正在吃Origin");
    }
}
class Banana implements Fruit{
    public void eat(){
        System.out.println("我正在吃Banana");
    }
}
class FruitFactory{                                 //工厂类
    /**
     * 取得指定的类型的接口对象
     * @param className 相应的接口子类
     * @return
     */
    public static Fruit getInfo(String className){
        if("Apple".equals(className)){
            return new Apple();
        }
        else if("Origin".equals(className)){
            return new Origin();
        }
        else if("Banana".equals(className)){
            return new Banana();
        }else{
            return null;
        }
    }
}
public class fruits {
    public static void main(String args[]){
        Fruit f=FruitFactory.getInfo("Banana"); //返回实例化Origin类开辟的空间地址
        f.eat();
        Fruit f2=FruitFactory.getInfo("Apple"); //返回实例化Apple类开辟的空间地址
        f2.eat();
        Fruit f3=FruitFactory.getInfo("dsds");  //返回空值，即没有实例化对象开辟空间
        f3.eat();
    }
}
