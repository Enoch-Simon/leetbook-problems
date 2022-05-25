package day02_链表_简单;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public int[] reversePrint(ListNode head) {
        List<Integer> resultList = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            resultList.add(node.val);
            node = node.next;
        }

        int size = resultList.size();
        int[] resultArray = new int[size];
        if (size > 0) {
            for (int i = 0; i < size / 2; i++) {
                resultArray[i] = resultList.get(size - 1 - i);
                resultArray[size - 1 - i] = resultList.get(i);
            }
            if (size % 2 != 0) {
                resultArray[size / 2] = resultList.get(size / 2);
            }
        }

        return resultArray;
    }
}

public class sfo06_02 {
    public static void main(String[] args) {
        ListNode head = new ListNode(8);
        head.next = new ListNode(4);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next = new ListNode(7);

        Solution2 solution = new Solution2();
        System.out.println(Arrays.toString(solution.reversePrint(head)));
    }
}
