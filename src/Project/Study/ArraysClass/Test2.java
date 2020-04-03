package Project.Study.ArraysClass;

import java.util.Arrays;

public class Test2 {
    public static void main(String[]args){
        int data1[]=new int[]{1,2,3,4,5};
        int data2[]=new int[]{1,2,3,5,4};
        int data3[]=new int[]{1,2,3};
        System.out.println(Arrays.equals(data1,data2));
        System.out.println(Arrays.equals(data1,data3));
    }
}
