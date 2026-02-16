public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            current.next = prev.next;
            prev.next = current;
            current = nextNode;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        testCase(solution, new int[]{});
        testCase(solution, new int[]{1});
        testCase(solution, new int[]{1, 2, 3, 4});
        testCase(solution, new int[]{4, 3, 2, 1});
        testCase(solution, new int[]{4, 2, 1, 3});
        testCase(solution, new int[]{3, 3, 1, 2});
        testCase(solution, new int[]{-1, 5, 3, 4, 0});
    }
    private static void testCase(Solution solution, int[] values) {
        ListNode head = buildList(values);

        System.out.print("Original: ");
        printList(head);

        head = solution.insertionSortList(head);

        System.out.print("Sorted:   ");
        printList(head);
    private static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }
    private static void printList(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
