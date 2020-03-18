public class Test1_1_2_1 {
    public static void main(String args[]){
        String str = "hello world !!!";
        String result[] = str.split(" ");
        for(int x=0;x<result.length;x++){
            System.out.print(result[x]+"、");
        }
        System.out.println();
        String result2[] = str.split("");
        for(int y=0;y<result2.length;y++){
            System.out.print(result2[y]+"、");
        }
        System.out.println();
        String result3[] = str.split(" ",3);
        for(int z=0;z<result3.length;z++){
            System.out.println(result3[z]);
        }
    }
}
