package Doubly_Linklist;

public class CheckPalindrome {
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

public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        count /= 2;

        ListNode curr = head;
        ListNode prev = null;

        while (count-- > 0) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;

        ListNode front = null;
        prev = null;

        while (curr != null) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        ListNode head1 = head;
        ListNode head2 = prev;

        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) {
                return false;
            } else {
                head1 = head1.next;
                head2 = head2.next;
            }
        }

        return true;
    }

     public static ListNode createList(int arr[]) {
        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

     public static void main(String[] args) {

        int arr[] = {1, 2, 2, 1};

        ListNode head = createList(arr);

        if (isPalindrome(head)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
