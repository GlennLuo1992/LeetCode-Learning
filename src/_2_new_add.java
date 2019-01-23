import neededClass.ListNode;

//此处的链表是单向的链表，都是存储着下一个链表对象
//算法需要考虑到某些特殊情况的细节，做到严密
public class _2_new_add {
    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 3};
        int[] b = new int[]{5, 6, 4};
        ListNode l1 = arry2List(a);
        ListNode l2 = arry2List(b);
        ListNode r = addTwoNumbers(l1, l2);
        while (r != null) {
            System.out.println(r.val);
            r = r.next;
        }
    }

    static private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    static private ListNode arry2List(int[] arry) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        for (int i : arry) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
