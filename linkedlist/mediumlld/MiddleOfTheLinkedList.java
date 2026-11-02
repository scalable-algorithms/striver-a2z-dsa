package striver_a2z_dsa.linkedlist.mediumlld;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode temp = head;
        for (int i = 0; i < 6; i++) {
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }
        System.out.println(middleNode(head));
    }

    private static ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }
        return list.get(list.size() / 2);
    }

}
