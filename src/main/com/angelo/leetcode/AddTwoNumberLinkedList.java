package com.angelo.leetcode;


//https://leetcode.com/problems/add-two-numbers/

//        Input: l1 = [2,4,3], l2 = [5,6,4,6]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.

public class AddTwoNumberLinkedList {

    public static void main(String[] args) {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = l1.val+l2.val;

        ListNode resultRunner = new ListNode(sum % 10);
        ListNode result = resultRunner;
        boolean carryOver = sum>9;

        while (l1.next != null && l2.next != null)
        {
            sum = l1.next.val+l2.next.val;
            if(carryOver)
            {
                sum++;
            }
            resultRunner.next = new ListNode(sum % 10);
            carryOver = sum>9;

            l1 = l1.next;
            l2 = l2.next;
            resultRunner = resultRunner.next;
        }

        while (l1.next != null)
        {
            sum = carryOver? l1.next.val+1 : l1.next.val;
            resultRunner.next = new ListNode(sum % 10);
            carryOver = sum>9;
            l1 = l1.next;
            resultRunner = resultRunner.next;
        }
        while (l2.next != null)
        {
            sum = carryOver? l2.next.val+1 : l2.next.val;
            resultRunner.next = new ListNode(sum % 10);
            carryOver = sum>9;
            l2 = l2.next;
            resultRunner = resultRunner.next;
        }
        if(carryOver)
        {
            resultRunner.next = new ListNode(1);
        }
        return result;
    }

    public AddTwoNumberLinkedList() {
    }

    static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}
