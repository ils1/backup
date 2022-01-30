public class _2_AddTwoNumbers {
    int val;
    _2_AddTwoNumbers next;
    _2_AddTwoNumbers(int x) {
        val = x;
    }
    class Solution {
        public static _2_AddTwoNumbers addTwoNumbers(_2_AddTwoNumbers l1, _2_AddTwoNumbers l2) {

            _2_AddTwoNumbers dummy_head = new _2_AddTwoNumbers(0);
            _2_AddTwoNumbers l3 = dummy_head;

            int carry = 0;
            while (l1 != null || l2 != null) {
                int l1_val = (l1 != null) ? l1.val : 0;
                int l2_val = (l2 != null) ? l2.val : 0;

                int current_sum = l1_val + l2_val + carry;
                carry = current_sum / 10;
                int last_digit = current_sum % 10;

                _2_AddTwoNumbers new_node = new _2_AddTwoNumbers(last_digit);
                l3.next = new_node;

                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
                l3 = l3.next;
            }
            if (carry > 0) {
                _2_AddTwoNumbers new_node = new _2_AddTwoNumbers(carry);
                l3.next = new_node;
                l3 = l3.next;
            }
            return dummy_head.next;
        }
    }

    public static void main(String[] args) {
        _2_AddTwoNumbers l1 = new _2_AddTwoNumbers(2);
        l1.next = new _2_AddTwoNumbers(4);
        l1.next.next = new _2_AddTwoNumbers(3);

        _2_AddTwoNumbers l2 = new _2_AddTwoNumbers(5);
        l2.next = new _2_AddTwoNumbers(6);
        l2.next.next = new _2_AddTwoNumbers(4);
    }
}
