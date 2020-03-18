class Node{
    private String data;
    private Node next;  //要保存的下一个节点
    //每一个Node类对象都必须保存有相应的数据
    public Node(String data){   //必须有数据才有Node
        this.data=data;
    }
    //设置下一个节点关系
    public void setNext(Node next){
        this.next=next; //next保存下一个Node类引用
    }
    //取得当前节点的下一个节点
    public Node getNext(){
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
public class Link1 {
    public static void main(String args[]){
        Node root=new Node("火车头");  //定义节点
        Node n1=new Node("车厢A");
        Node n2=new Node("车厢B");
        root.setNext(n1);   //设置节点关系
        n1.setNext(n2);     //设置节点关系
        Node currentNode=root;  //当前从根节点开始读取
        while(currentNode!=null){
            System.out.println(currentNode.getData());
            currentNode=currentNode.getNext();
        }
    }
}
