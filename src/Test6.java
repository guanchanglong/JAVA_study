public class Test6 {
    public static void main(String args[]){
        int num = 1 ;
        switch(num){
            case 1:{
                System.out.println("该数字为1");
                break;
            }
            case 2:{
                System.out.println("该数字为2");
                break;
            }
            case 3:{
                System.out.println("该数字为3");
                break;
            }
            default:{
                System.out.println("没有匹配的内容");
                break;
            }
        }

        String str = "Hello World" ;
        switch(str){
            case "hello":{
                System.out.println("hello");
                break;
            }
            case "Hello World":{
                System.out.println("Hello World");
                break;
            }
            default:{
                System.out.println("无匹配的内容");
                break;
            }
        }
    }
}