package Project.Study.Genericity;

import java.lang.reflect.Array;
import java.util.*;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.get(dif) != null) {
                res[0] = map.get(dif);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
class Solution1 {
    public int[] twoSum1(int[] nums, int target) {
        int num[]=new int[2];
        for (int x=0;x<nums.length;x++) {
            for (int y=x+1;y<nums.length;y++) {
                if(nums[x]+nums[y]==target&&x!=y){
                    num[0]=x;
                    num[1]=y;
                    break;
                }
            }
        }
        return num;
    }
}
public class Test1 {
    public static void main(String[] args){
        int num1[]=new int[]{2, 7, 11, 15,13,22,33,11};
        Solution m = new Solution();
        Solution1 m1=new Solution1();
        System.out.println(m.twoSum(num1,44));
        System.out.println(m1.twoSum1(num1,9));
    }
}
