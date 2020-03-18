public class data3 { //字符型数据
    public static void main(String args[]){
        char c = 'A' ;//'A'对应的ASCII码为65
        int num = c ;
        System.out.println(c);
        System.out.println(num);//故输出65

        char d = '关' ;//java的字符型因为使用了UNICODE编码(十六进制)，故可以保存任意的文字，因此可以保存中文，这是C语言不具备的
        int num2 = d ;
        System.out.println(num2);
    }
}
