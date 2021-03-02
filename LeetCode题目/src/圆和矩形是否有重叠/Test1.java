package 圆和矩形是否有重叠;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2020/12/10 17:53
 */

//这道题是判断圆和矩形是否有重合的题目
//感觉可以先通过两个图形的中心位置和他们的连线长度来判断
//智障了，还有长方形的情况
class Solution {
    public boolean checkOverlap(int radius, int x_center, int y_center, int x1, int y1, int x2, int y2) {
        double x,y,length_x,length_y;
        double r_length_x,r_length_y;
        x=((double) x1+(double) x2)/2;
        y=((double) y1+(double) y2)/2;
        length_x=((double) x2-(double) x1)/2;
        length_y=((double) y2-(double) y1)/2;
        if (x_center>x){
            r_length_x=x_center-x;
        }
        else{
            r_length_x=x-x_center;
        }
        if (y_center>y){
            r_length_y=y_center-y;
        }
        else{
            r_length_y=y-y_center;
        }

        double sum;
        sum=Math.pow(Math.pow(x_center-x,2)+Math.pow(y_center-y,2),0.5);

        if (x_center==x){
            return sum<=(radius+length_y);
        }
        if (y_center==y){
            return sum<=(radius+length_x);
        }
        if (x_center!=x||y_center!=y){
            //如果两点间连线小于半径加点到中心的距离
            if (sum<=(Math.pow((Math.pow((x-x1),2)+Math.pow((y-y1),2)),0.5) + radius)){
                return (r_length_x-radius) <= length_x || (r_length_y-radius) <= length_y;
            }
            else{
                return false;
            }
        }
        return false;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.checkOverlap(1 ,5 ,-2 ,0 ,0 ,10 ,2));
//        System.out.println(solution.checkOverlap(2 ,2 ,1 ,4 ,1 ,5 ,5));
//        System.out.println(solution.checkOverlap(10 ,10 ,1 ,0 ,0 ,100 ,100));
        //System.out.println(solution.checkOverlap(24 ,13 ,1 ,0 ,15 ,5 ,18));

    }
}
