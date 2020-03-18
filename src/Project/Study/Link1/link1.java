package Project.Study.Link1;

// 每一个链表实际上是由多个结点组成的
class Node { // 定义一个节点
    private String data; // 要保存的数据
    private Node next; // 要保存的下一个节点
    // 每一个Node类对象都必须保存有相应的数据
    public Node(String data) {
        this.data = data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return this.next;
    }
    public String getData() {
        return this.data;
    }
    public void addNode(Node newNode) {
        if(this.next == null) {
            this.next = newNode;
        }
        else {
            this.next.addNode(newNode);
        }
    }
    public void printNode() {
        System.out.println(this.data) ;
        if(this.next != null) {
            this.next.printNode();
        }
    }
}
class Link {
    private Node root ; // 根节点
    private Node last;
    public void add(String data) { //增加数据
        Node newNode = new Node(data);

        if(this.root == null) {
            this.root = newNode;
            this.last = newNode;
        }
        else {
            this.last.setNext(newNode);
            this.last = newNode;
        }

/*
	和上面的操作结果是一样的。也就是说得到的链表的逻辑关系是相同的。
	下面的操作的就是在Node类中定义一个添加节点的方法，然后把新创建
	的节点传过去然后通过递归找到最后一个节点，把newNode添加上去，
	如果这样
	需要比较的次数就是[(n-1)*n]/2
	时间复杂度就是
	O(n^2).
	效率十分低.
	所以就直接在私有属性中定义一个尾结点指针last，每次指向链表的最后一个结点，
	直接添加就可以了。
	O(1)
	数据结构学的他这样弄挺别扭的。
*/

//		if(this.root == null) {
//			this.root = newNode;
//		}
//		else {
//			this.root.addNode(newNode);
//		}

    }
    public void print() { // 输出数据
        if(this.root != null) {
            this.root.printNode();
        }
    }
}
public class link1 {
    public static void main(String []args) {
        Link link = new Link() ;
        link.add("Hello");
        link.add("World");
        link.add("Csdn");
        link.add("WW");
        link.print();
    }
}