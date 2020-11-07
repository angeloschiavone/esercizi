package com.angelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeListTest {

    @Test
    void isPalindromeFalse() {
        LinkedListNode node = new LinkedListNode(0);
        node.next = new LinkedListNode(1);
        assertFalse(PalindromeList.isPalindrome(node));
    }

    @Test
    void isPalindromeSingleElement() {
        LinkedListNode node = new LinkedListNode(0);
        assertTrue(PalindromeList.isPalindrome(node));
    }

    @Test
    void isPalindromeEvenTrue() {
        LinkedListNode node = new LinkedListNode(0);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(0);
        assertTrue(PalindromeList.isPalindrome(node));
    }

    @Test
    void isPalindromeOddTrue() {
        LinkedListNode node = new LinkedListNode(0);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(2);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(0);
        assertTrue(PalindromeList.isPalindrome(node));
    }

    @Test
    void isPalindromeLongEvenTrue() {
        LinkedListNode node = new LinkedListNode(0);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(3);
        node.next = new LinkedListNode(3);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(0);
        assertTrue(PalindromeList.isPalindrome(node));
    }

    @Test
    void isPalindromeLongOddTrue() {
        LinkedListNode node = new LinkedListNode(0);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(3);
        node.next = new LinkedListNode(5);
        node.next = new LinkedListNode(3);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(1);
        node.next = new LinkedListNode(0);
        assertTrue(PalindromeList.isPalindrome(node));
    }
}