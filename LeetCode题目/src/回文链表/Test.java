//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//}
//
////Time： O(n)
////Space: O(1)
////关于快慢指针的理解：
////我们把一个链表看成一个跑道，假设fast的速度是slow的两倍，那么当fast跑完全程后，slow刚好跑一半，以此来达到找到中间节点的目的。
////快慢指针的常用使用场景：
////1.在有序链表中寻找中位数
////2.查看该链表是否是闭环
//class Solution{
//    public boolean isPalindrome(ListNode head){
//        if (head==null||head.next==null){
//            return true;
//        }
//        ListNode p = mid(head);
//        ListNode reverseNode = reverse(p);
//        while(reverseNode!=null){
//            if (reverseNode.val!=head.val){
//                return false;
//            }
//            reverseNode = reverseNode.next;
//            head = head.next;
//        }
//        return true;
//    }
//    //找出链表的中间结点
//    public ListNode mid(ListNode head){
//        ListNode slow = head;
//        ListNode fast = head;
//        while(fast!=null&&fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//    //翻转链表（重点）
//    public ListNode reverse(ListNode head){
//        ListNode pre=null,next=null;
//        while(head!=null){
//            next = head.next;
//            head.next = pre;    //每次将pre的结点连接到head.next后面，
//            pre = head;         //有点像栈操作
//            head = next;
//        }
//        return pre;
//    }
//}
//
////class Solution {
////    public boolean isPalindrome(ListNode head) {
////        List<Object> objectList = new ArrayList<>();
////        List<Object> list = new ArrayList<>();
////        while(head!=null){
////            objectList.add(head.val);
////            list.add(head.val);
////            head=head.next;
////        }
////        Object[] nums1 = objectList.toArray();
////        Collections.reverse(list); //反转
////        Object[] nums2 = list.toArray();
////        return Arrays.equals(nums1,nums2);
////    }
////}
//
//////关于快慢指针的理解：
//////我们把一个链表看成一个跑道，假设fast的速度是slow的两倍，那么当fast跑完全程后，slow刚好跑一半，以此来达到找到中间节点的目的。
////class Solution {
////    public boolean isPalindrome(ListNode head) {
////
////        //当链表为空或者只有一个元素的时候都为回文链表
////        if(head == null || head.next == null){
////            return true;
////        }
////
////        // 找出中间节点
////        ListNode mid = mid(head);
////
////        // 翻转中间节点
////        ListNode rev = reverse(mid);
////
////        while(rev != null) {
////            if(rev.val != head.val){
////                return false;
////            }
////            rev = rev.next;
////            head = head.next;
////        }
////
////        // 修复反转的节点
////        reverse(mid);
////        return true;
////
////    }
////
////    // 找出一个链表中的中间界节点，如果是偶数个就偏后一个
////    public ListNode mid(ListNode head) {
////
////        //创建快指针
////        ListNode fast = head;
////
////        //创建慢指针
////        ListNode slow = head;
////
////        while(fast != null && fast.next != null) {
////
////            //fast走两步
////            fast = fast.next.next;
////
////            //slow：走一步
////            slow = slow.next;
////        }
////
////        //当fast走完全程之后，slow到链表的中点，返回中间结点
////        return slow;
////    }
////
////    // 翻转一个链表
////    public ListNode reverse(ListNode head) {
////        ListNode cur = head, pre = null, next = null;
////        while(cur != null) {
////            next = cur.next;
////            cur.next = pre;
////            pre = cur;
////            cur = next;
////        }
////        return pre;
////    }
////}
//
//
//
//
//public class Test {
//    public static int[] stringToIntegerArray(String input) {
//        input = input.trim();
//        input = input.substring(1, input.length() - 1);
//        if (input.length() == 0) {
//            return new int[0];
//        }
//
//        String[] parts = input.split(",");
//        int[] output = new int[parts.length];
//        for(int index = 0; index < parts.length; index++) {
//            String part = parts[index].trim();
//            output[index] = Integer.parseInt(part);
//        }
//        return output;
//    }
//
//    public static ListNode stringToListNode(String input) {
//        // Generate array from the input
//        int[] nodeValues = stringToIntegerArray(input);
//
//        // Now convert that list into linked list
//        ListNode dummyRoot = new ListNode(0);
//        ListNode ptr = dummyRoot;
//        for(int item : nodeValues) {
//            ptr.next = new ListNode(item);
//            ptr = ptr.next;
//        }
//        return dummyRoot.next;
//    }
//
//    public static String booleanToString(boolean input) {
//        return input ? "True" : "False";
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            ListNode head = stringToListNode(line);
//
//            boolean ret = new Solution().isPalindrome(head);
//
//            String out = booleanToString(ret);
//
//            System.out.print(out);
//        }
//    }
//}
