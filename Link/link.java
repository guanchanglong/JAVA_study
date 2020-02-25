package Project.Study.Link;

import java.lang.*;

class Link1{                         //链表类
    private class Node{             //定义的内部节点
        private Object data;        //要保存的数据
        private Node next;          //下一个节点引用
        public Node(Object data){   //每一个Node类对象都必须保存相应的数据
            this.data=data;
        }
        /**
         * 设置新节点的保存，所有的新节点保存在最后一个节点后
         * @param newNode   新节点对象
         */
        public void addNode(Node newNode){
            if (this.next==null){   //当前的下一节点
                this.next=newNode;  //保存节点
            }else{                  //向后保存
                this.next.addNode(newNode);
            }
        }
        /**
         * 数据检索操作，判断指定数据是否存在
         * 第一次调用(Link):this=Link.root
         * 第二次调用(Node):this=Link.root.next
         * @param data  要查询的数据
         * @return      如果数据存在返回true，否则返回false
         */
        public boolean containsNode(Object data){
            if (data.equals(this.data)){    //当前节点数据为要查询的数据
                return true;                //后面不再查了
            }else{                          //当前节点数据不满足查询要求
                if (this.next!=null){       //还有后续节点
                    return this.next.containsNode(data);    //递归调用继续查询
                }else{                      //没有后续节点
                    return false;            //没有查询到，返回false
                }
            }
        }
        /**
         *根据索引取出数据，此时该索引一定是存在的
         * @param index 要取得数据的索引编号
         * @return      返回指定索引节点包含的数据
         */
        public Object getNode(int index){
            //使用当前的foot内容与要查找的索引进行比较，随后将foot的内容自增，目的是下次查询方便
            if (Link1.this.foot++==index){       //当前为要查询的数据
                return this.data;               //返回当前节点数据
            }else{                              //继续向后查询
                return this.next.getNode(index);//进行下一个节点的判断
            }
        }

        /**
         * 修改指定索引节点包含的数据
         * @param index 要修改的索引编号
         * @param data  新数据
         */
        public void setNode(int index,Object data){
            //使用当前foot内容与要查询的索引进行比较，随后将foot的内容自增，目的是下次查询方便
            if (Link1.this.foot++==index){       //当前为要修改的索引
                this.data=data;                 //进行内容的修改
            }else{
                this.next.setNode(index,data);  //继续下一个节点的索引判断
            }
        }

        /**
         * 节点的删除操作，匹配每一个节点的数据，如果当前节点数据符合删除数据则使用"当前节点上一节点.next=当前节点.next"的方式空出当前节点
         * 第一次调用(Link),previous=Link.root、this=Link.root.next
         * 第二次调用(Node),previous=Link.root.next、this=Link.root.next.next
         * @param previous  当前节点的上一个节点
         * @param data      要删除的数据
         */
        public void removeNode(Node previous,Object data){
            if (data.equals(this.data)){                    //当前节点为要删除节点
                previous.next=this.next;                    //空出当前节点
            }else{                                          //应该向后继续查询
                this.next.removeNode(this,data);   //继续下一个判断
            }
        }

        /**
         * 将节点中保存的内容转换为对象数组
         * 第一次调用(Link):this=Link.root;
         * 第二次调用(Node):this=Link.root.next;
         */
        public void toArrayNode(){
            Link1.this.retArray[Link1.this.foot++]=this.data; //取出数据并保存在数组中
            if (this.next!=null){                           //有后续元素
                this.next.toArrayNode();                    //继续下一个数据的取得
            }
        }
    }
    private Node root;          //根节点定义
    private int count=0;        //保存元素的个数
    private int foot=0;         //节点索引
    private Object[]retArray;   //返回的数组

    /**
     * 用户向链表增加新的数据，在增加时要将数据封装为Node类，这样才可以匹配节点顺序
     * @param data  要保存的数据
     */
    public void add(Object data){       //假设不允许有null
        if (data==null){                //判断数据是否为空
            return;                     //结束方法调用
        }
        Node newNode=new Node(data);    //要保存的数据
        if (this.root==null){           //当前没有根节点
            this.root=newNode;          //保存根节点
        }else{                          //根节点存在
            this.root.addNode(newNode); //交给Node类处理节点的保存
        }
        this.count++;                   //数据保存成功后保存个数加一
    }

    /**
     * 取得链表中保存的数据个数
     * @return  保存的个数，通过count属性取得
     */
    public int size(){      //取得保存的数据量
        return this.count;
    }

    /**
     * 判断是否为空链表，表示长度为0，不是null
     * @return  如果链表中没有保存任何数据则返回true，否则返回false
     */
    public boolean isEmpty(){
        return this.count==0;
    }

    /**
     * 数据查询操作，判断指定的数据是否存在，如果链表没有数据直接返回false
     * @param data  要判断的数据
     * @return      数据存在返回true，否则返回false
     */
    public boolean contain(Object data){
        if (data==null||this.root==null){       //现在没有需要查询的数据，根节点也不保存数据
            return false;                       //没有查询结果
        }
        return this.root.containsNode(data);    //交由Node类查询
    }

    /**
     * 根据索引取得保存的节点数据
     * @param index 索引数据
     * @return      如果要取得的索引内容不存在或者大于保存个数，返回null，反之返回数据
     */
    public Object get(int index){
        if (index>this.count){              //超过了查询范围
            return null;                    //没有数据
        }
        this.foot=0;                        //表示从前向后查询
        return this.root.getNode(index);    //查询过程交给Node类
    }

    /**
     * 根据索引修改数据
     * @param index 要修改数据的索引编号
     * @param data  新的数据内容
     */
    public void set(int index,Object data){
        if (index>this.count){          //判断是否超过了保存范围
            return;                     //结束方法调用
        }
        this.foot=0;                    //重新设置foot属性的内容，作为索引出现
        this.root.setNode(index,data);  //交给Node类设置数据内容
    }

    /**
     * 如果要删除的数据不是根节点数据，则将删除操作交由Node类的removeNode()方法完成
     * @param data  要删除的数据
     */
    public void remove(Object data){
        if (this.contain(data)){                //主要功能是判断数据是否存在
            //要删除数据是否是根节点数据，root是Node类的对象，此处直接访问内部类的私有操作
            if (data.equals(this.root.data)){   //根节点数据为要删除数据
                this.root=this.root.next;       //空出当前根节点
            }else{                              //根节点数据不是要删除数据
                //此时根元素已经判断过了，从第二个元素开始判断，即第二个元素的上一个元素为根节点
                this.root.next.removeNode(this.root,data);
            }
            this.count--;                       //删除成功后个数要减少
        }
    }

    /**
     * 将链表中的数据转换为对象数组输出
     * @return  如果链表没有数据，返回null，如果有数据，则将数据变为对象数组后返回
     */
    public Object[]toArray(){
        if (this.root==null){                   //判断链表是否有数据
            return null;                        //没有数据，返回null
        }
        this.foot=0;                            //脚标清零操作
        this.retArray=new Object[this.count];   //根据保存内容开辟数组
        this.root.toArrayNode();                //交给Node类处理
        return this.retArray;                   //返回数组对象
    }

    /**
     * 清空链表数据
     */
    public void clear(){
        this.root=null;     //清空链表
        this.count=0;       //元素个数为0
    }
}

public class link {
    public static void main(String args[]){
        Link1 all=new Link1();
        all.add("A");                       //实例化链表对象
        all.add("B");                       //String转为Object
        all.add("C");
        System.out.println(all.size());     //节点个数
        System.out.println(all.isEmpty());  //判断是否为空链表
        System.out.println(all.toArray());
        System.out.print(all.get(1));       //查找元素
    }
}
