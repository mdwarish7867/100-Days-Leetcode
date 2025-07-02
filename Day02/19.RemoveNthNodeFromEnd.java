class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        // Move fast pointer n steps ahead
        for(int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // If fast is null, it means we need to remove the first node
        if (fast == null) {
            return head.next;
        }

        // Move both fast and slow until fast reaches the end
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return head;
    }
}
