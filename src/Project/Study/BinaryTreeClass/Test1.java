package Project.Study.BinaryTreeClass;

import java.util.Arrays;

class Book implements Comparable<Book>{     //实现比较
    private String title;
    private double price;
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    @Override
    public String toString(){
        return "书名："+this.title+",价格："+this.price+"\n";
    }
    @Override
    public int compareTo(Book o){
        return Double.compare(this.price,o.price);
    }
}
@SuppressWarnings("rawtypes")
class BinaryTree{
    private class Node{
        private Comparable data;        //排序的依据就是Comparable
        private Node left;              //保存左节点
        private Node right;             //保存右节点
        public Node(Comparable data){   //定义构造方法
            this.data=data;
        }
        @SuppressWarnings("unchecked")
        public void addNode(Node newNode){
            if (this.data.compareTo(newNode.data)>0){
                if (this.left==null){
                    this.left=newNode;
                }else{
                    this.left.addNode(newNode);
                }
            }else{
                if (this.right==null){
                    this.right=newNode;
                }else{
                    this.right.addNode(newNode);
                }
            }
        }
        public void toArrayNode(){
            if (this.left!=null){
                this.left.toArrayNode();
            }
            BinaryTree.this.retData[BinaryTree.this.foot++]=this.data;
            if (this.right!=null){
                this.right.toArrayNode();
            }
        }
    }
    private Node root;
    private int count;
    private Object[] retData;
    private int foot;
    public void add(Object obj){
        Comparable com=(Comparable)obj;
        Node newNode=new Node(com);
        if (this.root==null){
            this.root=newNode;
        }else{
            this.root.addNode(newNode);
        }
        this.count++;
    }
    public Object[] toArray(){
        if (this.root==null){
            return null;
        }
        this.foot=0;
        this.retData=new Object[this.count];
        this.root.toArrayNode();
        return this.retData;
    }
}
public class Test1 {
    public static void main(String[]args){
        BinaryTree bt=new BinaryTree();
        bt.add(new Book("Java",79.8));
        bt.add(new Book("Python",75));
        bt.add(new Book("C++",76));
        bt.add(new Book("C",80));
        Object[] obj =bt.toArray();
        System.out.println(Arrays.toString(obj));
    }
}
