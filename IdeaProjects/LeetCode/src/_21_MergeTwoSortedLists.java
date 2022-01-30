public class _21_MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode head3 = new ListNode();
        while (head1 != null || head2 != null) {
            if (head1.val < head2.val) {
                ListNode temp = new ListNode(head1.val, null);
                head3.next = temp;
            } else {
                ListNode temp = new ListNode(head2.val, null);
                head3.next = temp;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head3;
    }
}
class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
