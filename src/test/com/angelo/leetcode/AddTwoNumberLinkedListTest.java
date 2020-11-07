package com.angelo.leetcode;

import org.junit.Before;

import static com.angelo.leetcode.AddTwoNumberLinkedList.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class AddTwoNumberLinkedListTest {

    AddTwoNumberLinkedList addTwoNumberLinkedList ;

    @Before
    public void setUp() throws Exception {
        addTwoNumberLinkedList = new AddTwoNumberLinkedList();
    }

    @org.junit.Test
    public void addTwoDifferentListsWithCarryOver() {
        ListNode l1 = new ListNode(7, new ListNode(8, new ListNode(6, new ListNode(1))));

        ListNode l2 = new ListNode(9, new ListNode(8));

        ListNode result = addTwoNumberLinkedList.addTwoNumbers(l1,l2);
        assertThat(result.val, is(6));
        assertThat(result.next.val, is(7));
        assertThat(result.next.next.val, is(7));
        assertThat(result.next.next.next.val, is(1));
        assertNull(result.next.next.next.next);
    }

    @org.junit.Test
    public void addTwoHundredCarryOver() {
        ListNode l1 = new ListNode(7, new ListNode(6));

        ListNode l2 = new ListNode(9, new ListNode(8));

        ListNode result = addTwoNumberLinkedList.addTwoNumbers(l1,l2);
        assertThat(result.val, is(6));
        assertThat(result.next.val, is(5));
        assertThat(result.next.next.val, is(1));
        assertNull(result.next.next.next);
    }

    @org.junit.Test
    public void addTwoHundredNoCarryOver() {
        ListNode l1 = new ListNode(7, new ListNode(4));

        ListNode l2 = new ListNode(2, new ListNode(3));

        ListNode result = addTwoNumberLinkedList.addTwoNumbers(l1,l2);
        assertThat(result.val, is(9));
        assertThat(result.next.val, is(7));
        assertNull(result.next.next);
    }

    @org.junit.Test
    public void addTwoUnitsCarryOver() {
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(5);

        ListNode result = addTwoNumberLinkedList.addTwoNumbers(l1,l2);
        assertThat(result.val, is(2));
        assertThat(result.next.val, is(1));
        assertNull(result.next.next);
    }

    @org.junit.Test
    public void addTwoUnitsNoCarryOver() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);

        ListNode result = addTwoNumberLinkedList.addTwoNumbers(l1,l2);
        assertThat(result.val, is(7));
        assertNull(result.next);
    }

    @org.junit.Test
    public void addTwoZeros() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode result = addTwoNumberLinkedList.addTwoNumbers(l1,l2);
        assertThat(result.val, is(0));
        assertNull(result.next);
    }
}