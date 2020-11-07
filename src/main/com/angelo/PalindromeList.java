package com.angelo;

import java.util.Stack;

public class PalindromeList {

    public static boolean isPalindrome(LinkedListNode head)
    {
        Stack<Integer> stack = new Stack<>();
        LinkedListNode slow = head, fast = head;
        while(fast != null)
        {
            stack.push(slow.data);
            slow = slow.next;
            if(fast.next==null)
            {
                stack.pop();
                break;
            }
            fast = fast.next.next;
        }
        while(slow != null)
        {
            if(!stack.pop().equals(slow.data))
                return false;
            slow = slow.next;
        }

        return true;
    }
}
