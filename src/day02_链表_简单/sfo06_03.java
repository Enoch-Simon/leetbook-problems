package day02_链表_简单;

import java.util.ArrayList;
import java.util.Arrays;

class Solution3 {
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }
    void recur(ListNode head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }
}

public class sfo06_03 {
    public static void main(String[] args) {
        ListNode head = new ListNode(8);
        head.next = new ListNode(4);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next = new ListNode(7);

        Solution3 solution = new Solution3();
        System.out.println(Arrays.toString(solution.reversePrint(head)));
    }
}
