public class Test1_9 {
    public static void main(String args[]){
        int data[] = new int [3];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        int temp[] = data;  //数组的引用传递
        temp[0] = 99;
        for(int x=0;x<data.length;x++) {
            System.out.println(data[x]);
        }
    }
}
