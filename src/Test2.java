public class Test2 {
        public static void main(String args[]) {
            //if((1==2)&(10/0)==0){//(10/0)==0出现错误
            //    System.out.println("Hello World");
            //}
            //解决办法，使用&&，因为(1==2)是false，所以不再判断后面的((10/0)==0)，故编译器不会报错
            if ((1 == 2) && (10 / 0) == 0) {
                System.out.println("Hello World");
            }
        }
        }