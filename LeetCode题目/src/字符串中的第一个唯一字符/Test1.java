package 字符串中的第一个唯一字符;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/1/2 17:11
 */
//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer>map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for (int i=0;i<s.length();i++){
            if (map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("leetcode"));
    }
}
