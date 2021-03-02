package 找出给定方程的正整数解;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2020/12/23 13:32
 */
interface CustomFunction {
    public int f(int x, int y);
};
class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> ans = new ArrayList<>();
        int y = 1, x = 1000;
        while (y <= 1000) {
            while (x >= 1 && customfunction.f(x, y) > z){
                --x;
            }
            if (x >= 1 && customfunction.f(x, y) == z) {
                List<Integer> xy = new ArrayList<>();
                xy.add(x);
                xy.add(y);
                ans.add(xy);
            }
            ++y;
        }
        return ans;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
