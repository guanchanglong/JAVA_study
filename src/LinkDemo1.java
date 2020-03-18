class Node2{
    private String data;
    private Node2 next;
    public Node2(String data){
        this.data=data;
    }
    public void setNext(Node2 next){
        this.next=next;
    }
    public Node2 getNext(){
        return this.next;
    }
    public String getData(){
        return this.data;
    }
    public void addNode2(Node2 newNode2){
        if(this.next==null){
            this.next=newNode2;
        }
        else{
            this.next.addNode2(newNode2);
        }
    }
    public void printNode2(){
        System.out.println(this.data);
        if(this.next!=null){
            this.next.printNode2();
        }
    }
}
class Link{
    private Node2 root;
    public void add(String data){
        Node2 newNode2=new Node2(data);
        if(this.root==null){
            this.root=newNode2;
        }
        else{
            this.root.addNode2(newNode2);
        }
    }
    public void print(){
        if(this.root!=null){
            this.root.printNode2();
        }
    }
}
public class LinkDemo1 {
    public static void main(String args[]){
        Link link=new Link();
        link.add("Hello");
        link.add("World");
        link.add("小关");
        link.print();
    }
}
//结果
//Hello
//World
//小关
