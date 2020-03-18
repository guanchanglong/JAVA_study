class Link3{
    private class Node{     //定义的内部节点类
        private String data;
        private Node next;      //下一个节点引用
        public Node(String data){       //每一个Node类对象都必须保存相应数据
            this.data=data;
        }
        public void addNode(Node newNode){
            if(this.next==null){    //若当前的下一个节点为null
                this.next=newNode;      //保存节点
            }
            else{       //向后继续保存
                this.next.addNode(newNode);
            }
        }
    }
    private Node root;
    public void add(String data){       //假设不允许有null
        if (data==null){        //判断数据是否为空
            return ;
        }
        Node newNode=new Node(data);        //要保存的数据
        if (this.root==null){       //当前没有根节点
            this.root=newNode;      //保存根节点
        }
        else{       //根节点存在
            this.root.addNode(newNode);
        }
    }
}
public class LinkDemo2 {
    public static void main(String args[]){
        Link3 all=new Link3();      //创建链表对象
        all.add("Hello");       //保存数据
        all.add("World");
        all.add(null);
    }
}
