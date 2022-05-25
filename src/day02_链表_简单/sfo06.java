package day02_链表_简单;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> resultList = new ArrayList<>();
        ListNode node = head;
        int count = 0;
        while (node != null) {
            resultList.add(0, node.val);
            node = node.next;
            count++;
        }

        int[] resultArray = new int[count];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}

public class sfo06 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.reversePrint(head)));
    }
}
