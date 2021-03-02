package 使数组和能被P整除;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2020/12/15 19:48
 */
//两数a, b 对 p 同余, 则 (a - b) % p = 0
//a % p=k       b % p = k
//要求 (a - b) % p = 0, 其中 a % p = k, 则b % p = k
//则 b % p = k,  b 为连续的一段子数组之和. 取最短的 b.

//(a+b)%m = (a%m+b%m)%m;
//
//a*b%m = ((a%m)*(b%m))%m;


//两数a, b 对 p 同余, 则 (a - b) % p = 0.
//sum % p = k
//如果 k != 0,  记 sum = a,
//要求 (a - b) % p = 0, 其中 a % p = k, 3 1 4 2
//则 b % p = k,  b 为连续的一段 子数组之和. 取最短的 b
class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        Map<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(0,0);
        //前缀数组
        int[] presum = new int[n+1];
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n ; i++){
            presum[i+1] = (presum[i] + nums[i]) % p;
        }

        int mod = presum[n] % p;

        //如果取模为0，则直接返回0
        if (mod == 0){
            return 0;
        }

        int targetKey;
        for (int i = 1; i <= n ;i++){
            int cur = presum[i];
            hashmap.put(cur,i);
            //寻找是否前面存在一个子区间的前缀和取余为cur-res
            targetKey = (cur - mod + p) % p;
            if (hashmap.containsKey(targetKey)){
                ans = Math.min(ans, i-hashmap.get(targetKey));
            }
        }
        if (ans == Integer.MAX_VALUE || ans == n){
            return -1;
        }
        return ans;
    }
}

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,4,2,6,8,2,7,3,1,10,1,7,4,3,1,6,8,9};
        Solution solution = new Solution();
        System.out.println(solution.minSubarray(nums,6));
    }
}
