public class Test1_1_9 {
    public static void main(String args[]){
        String stra = new String("Hello").intern();
        String strb = "Hello";
        System.out.println(stra==strb);
    }
}
