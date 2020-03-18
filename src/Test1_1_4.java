public class Test1_1_4 {
    public static void main(String args[]){
        int dataA[] = new int[]{1,2,3,4,5,6,7,8};
        int dataB[] = new int[]{11,22,33,44,55,66,77,88};
        System.arraycopy(dataA,4,dataB,2,3);
        print(dataB);
    }
    public static void print(int temp[]){
        for(int x=0;x<temp.length;x++){
            System.out.print(temp[x]+"、");
        }
        System.out.println();
    }
}
