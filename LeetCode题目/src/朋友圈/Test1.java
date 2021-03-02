package 朋友圈;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2020/12/15 16:49
 */

//并查集
//class Solution {
//    int[]nums = new int[200];
//    public int findCircleNum(int[][] M) {
//        int sum = 0,x,y;
//        init(nums,M.length);
//        for (int i = 0;i < M.length;i++){
//            for (int j = i;j < M.length;j++){
//                if (M[i][j]==1){
//                    x = find(i);
//                    y = find(j);
//                    union(x,y);
//                }
//            }
//        }
//        for (int i=0;i<M.length;i++){
//            if (nums[i]==i){
//                sum++;
//            }
//        }
//        return sum;
//    }
//    public void init(int[]nums,int length){ //初始化
//        for (int i=0;i<length;i++){
//            nums[i]=i;
//        }
//    }
//    public int find(int x){ //查
//        int a = x;      //使用a标记根节点
//        while(x!=nums[x]){
//            x = nums[x];
//        }
//        nums[a]=x;      //直接使根节点指向尾节点
////        //经过循环过后，此时的x已经不是根节点了，而是末尾节点，a才是根节点
////        int b;
////        //循环将每一个节点都指向末尾节点
////        while (a != nums[a]) {
////            b = a;              //b记录下根节点
////            a = nums[a];        //a等于根节点指向的下一个元素的下标
////            nums[b] = x;		//指向根节点
////        }
//        return x;
//    }
//    public void union(int x,int y){ //合并
//        nums[x] = y;
//    }
//}

//深度优先搜索
class Solution {
    public void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }
}

public class Test1 {
    public static void main(String[] args) {
        int[][]nums = new int[][]{{1,1,0},
                                  {1,1,0},
                                  {0,0,1}};
//        int[][]nums = new int[][]{{1,1,0},
//                                  {1,1,1},
//                                  {0,1,1}};
        Solution solution = new Solution();
        int num = solution.findCircleNum(nums);
        System.out.println(num);
    }
}
