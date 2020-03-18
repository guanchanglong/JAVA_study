class Node1{
    private String data;
    private Node1 next;  //要保存的下一个节点
    //每一个Node类对象都必须保存有相应的数据
    public Node1(String data){   //必须有数据才有Node
        this.data=data;
    }
    //设置下一个节点关系
    public void setNext(Node1 next){
        this.next=next; //next保存下一个Node类引用
    }
    //取得当前节点的下一个节点
    public Node1 getNext(){
        return this.next;   //当前节点的下一个节点引用
    }
    //设置或修改当前节点包装的数据
    public void setData(String data){
        this.data=data;
    }
    //取得包装的数据
    public String getData(){
        return this.data;
    }
}
public class Link2 {
    public static void main(String args[]){
        Node1 root=new Node1("火车头");
        Node1 n1=new Node1("车厢A");
        Node1 n2=new Node1("车厢B");
        root.setNext(n1);
        n1.setNext(n2);
        print(root);
    }
    public static void print(Node1 current){
        if(current==null){
            return ;
        }
        System.out.println(current.getData());
        print(current.getNext());
    }
}
