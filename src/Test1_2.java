public class Test1_2 {
    public static void main(String args[]){
        Book BookA = new Book();
        Book BookB = null ;//注意这里没有使用new实例化
        BookA.title = "java开发";
        BookA.price = 89.9;
        BookB=BookA;//引用传递，相当于BookA和BookB这两个栈内存同时指向同一块堆内存
        BookB.price = 60;//所以BookB修改属性内容时，会直接影响BookA对象的内容
        BookA.getlnfo();
    }
}