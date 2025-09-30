package com.jacandre.questions._0002_add_two_numbers;

import lombok.extern.slf4j.Slf4j;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

@Slf4j
public class AddTwoNumbers {

    public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public ListNode addTwoNumbers (ListNode l1, ListNode l2, int mod) {
        if (l1 == null && l2 == null && mod == 0) {
            return null;
        }

        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;
        int sum = val1 + val2 + mod;

        int newVal = sum % 10;
        int newMod = sum / 10;

        log.info("Adding {} and {} to get {}, Remainder: {}", val1, val2, newVal, newMod);

        ListNode next1 = (l1 != null) ? l1.next : null;
        ListNode next2 = (l2 != null) ? l2.next : null;

        return new ListNode(newVal, addTwoNumbers(next1, next2, newMod));
    }
}
