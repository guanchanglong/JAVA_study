import java.util.Arrays;

public class Test1_1_5 {
    public static void main(String args[]){
        int data[] = new int[]{3,6,1,2,8,0};
        Arrays.sort(data);
        print(data);
    }
    public static void print(int temp[]){
        for(int x=0;x<temp.length;x++){
            System.out.print(temp[x]+"、");
        }
        System.out.println();
    }
}
