public class Test1_1_4_7 {
    public static void main(String args[]){
        Object obj=new int[]{1,2,3};
        System.out.println(obj);
        if (obj instanceof int[]){
            int data[]=(int[])obj;
            for (int x=0;x<data.length;x++){
                System.out.print(data[x]+"、");
            }
        }
    }
}
