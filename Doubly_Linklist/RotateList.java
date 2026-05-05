package Doubly_Linklist;

public class RotateList {

    // FIX: make it static
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int count = 0;
        ListNode temp = head;

        // Count length
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        k = k % count;
        if (k == 0) return head;

        int move = count - k;

        ListNode curr = head;
        ListNode prev = null;

        // Move to new head position
        while (move-- > 0) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;

        // Find tail of remaining list
        ListNode tail = curr;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head;

        return curr;
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4,
                new ListNode(5)))));

        RotateList sol = new RotateList();
        int k = 2;

        ListNode result = sol.rotateRight(head, k);

        // Print rotated list
        printList(result);
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}