package 被围绕的区域;

import java.util.Map;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2020/12/11 22:04
 */
class Solution {
    int x,y;
    public void solve(char[][] board) {
        if (board==null||board.length==0){
            return;
        }
        y=board.length;     //行
        x=board[0].length;  //列
        if (y==1&&x==1){
            return;
        }
        //将与外边相邻的‘O’节点标记起来
        for (int i=0;i<x;i++){
            find(board,0,i);
            find(board,y-1,i);
        }
        for (int i=0;i<y;i++){
            find(board,i,0);
            find(board,i,x-1);
        }
        for (int i=0;i<y;i++){
            for (int j=0;j<x;j++){
                //这两个判断顺序不能反，不然会将你之前转化了的在外围的‘O’重新转化为‘X’...
                if (board[i][j]=='O'){
                    board[i][j]='X';
                }
                if (board[i][j]=='a'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void find(char[][]chars,int row,int column){          //查
        if(row<0||row>=y||column<0||column>=x||chars[row][column]=='X'||chars[row][column]=='a'){
            return;
        }
        chars[row][column]='a';
        find(chars,row+1,column);
        find(chars,row-1,column);
        find(chars,row,column+1);
        find(chars,row,column-1);
    }
}
public class Test1 {
    public static void main(String[] args) {
//        char[][]chars = new char[][]{{'X','X','X','X'},
//                                     {'X','O','O','X'},
//                                     {'X','O','X','X'},
//                                     {'X','X','O','X'}};
        char[][]chars = new char[][]{{'O'},{'X'}};
        Solution solution = new Solution();
        solution.solve(chars);
    }
}
