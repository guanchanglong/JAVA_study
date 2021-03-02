import java.util.Stack;

//在这道题中只要有一个满足132模式的话都返回true，所以我们只要找到最容易找到的特例就行了
//class Solution {
//    public boolean find132pattern(int[] nums) {
//        //如果数组长度小于3则，直接返回false
//        if (nums.length < 3) {
//            return false;
//        }
//
//        //将三重循环优化一遍
//        for (int j = 1; j < nums.length - 1; j++) {
//
//            int pre = nums[0];
//            for (int i = 1; i < j; i++) {
//                //找出最小值
//                if (pre>nums[i]){
//                    pre = nums[i];
//                }
//            }
//            //nums[j]是中间的数，nums[k]是末尾的数
//            for (int k = j + 1; k < nums.length; k++) {
//                if (pre < nums[k] && nums[j] > nums[k]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}



//最优题解
//class Solution {
//    public boolean find132pattern(int[] nums) {
//        int n = nums.length;
//        //此处的Integer.MIN_VALUE是整型的最小值
//        int third = Integer.MIN_VALUE;
//        int top = n;
//
//        for (int i = n - 1; i >= 0; i--) {
//            //第一次进来如果存在比整型的最小值都小的数直接变成整型最大的数，则肯定存在132模式
//            //后面进来，如果第一个数小于第三个数，则直接返回true
//            if (nums[i] < third){
//                return true;
//            }
//
//            //将nums[i]视为第二个元素，如果第二个元素大于或者等于第三个元素，
//            //遇到比第二个元素大的就入栈
//            while (top < n && nums[i] > nums[top]) {
//                //比nums[i]（第二个元素小的就将它的值给第三个元素，符合32原则）
//                third = nums[top++];
//            }
//            //nums[i]的值比第二个元素大，直接入栈(放到数组的后面)
//            top--;
//            nums[top] = nums[i];
//        }
//        return false;
//    }
//}


//官方题解
//class Solution {
//    public boolean find132pattern(int[] nums) {
//        //数组长度小于3则直接返回false
//        if (nums.length < 3){
//            return false;
//        }
//        //创建栈
//        Stack< Integer > stack = new Stack <> ();
//        int[] min = new int[nums.length];
//        min[0] = nums[0];
//        int num = min[0];
//
//        //循环遍历出最小数组
//        for (int i = 1; i < nums.length; i++){
//            //min[i] = Math.min(min[i - 1], nums[i]);
//            if(num>nums[i]){
//                min[i] = nums[i];
//                num = nums[i];
//            }
//            else{
//                min[i] = num;
//            }
//        }
//
//        //从后往前遍历入栈，形成一个递减栈
//        for (int j = nums.length - 1; j >= 0; j--) {
//            //如果比最小数组里面的元素小的话就入栈，满足13条件
//            if (nums[j] > min[j]) {
//                //如果栈不为空，而且栈顶元素小于等于min[j]，栈顶元素出栈
//                while (!stack.isEmpty() && stack.peek() <= min[j]){
//                    stack.pop();
//                }
//                //满足32条件
//                if (!stack.isEmpty() && stack.peek() < nums[j]){
//                    return true;
//                }
//                stack.push(nums[j]);
//            }
//        }
//        return false;
//    }
//}

//class Solution{
//    public boolean find132pattern(int[] nums) {
//        if(nums.length<3){
//            return false;
//        }
//        int[] min=new int[nums.length];
//        min[0]=nums[0];
//        int num = nums[0];
//
//        //先遍历出最小数组
//        for (int i=1;i<nums.length;i++){
//            if(num>nums[i]){
//                min[i] = nums[i];
//                num = nums[i];
//            }
//            else{
//                min[i] = num;
//            }
//        }
//        //再创建栈
//        Stack<Integer>stack = new Stack<>();
//        for(int i=nums.length-1;i>=0;i--){
//            //符合13模式
//            if(nums[i]>min[i]){
//                while(!stack.empty()&&stack.peek()<=min[i]){
//                    stack.pop();
//                }
//                //符合32模式
//                if (!stack.empty()&&stack.peek()<nums[i]){
//                    return true;
//                }
//                stack.push(nums[i]);
//            }
//        }
//        return false;
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[]nums = new int[]{3,4,1,2,5};
//        System.out.println(solution.find132pattern(nums));
//    }
//}
