package Project.Study.ArraysClass;

import java.util.Arrays;

public class Test1 {
    public static void main(String[]args){
        int data[]=new int[]{1,5,6,7,2,4,3,9,8};
        java.util.Arrays.sort(data);
        System.out.println(Arrays.binarySearch(data,9));
    }
}
