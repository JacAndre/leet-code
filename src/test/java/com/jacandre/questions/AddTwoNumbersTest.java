package com.jacandre.questions;

import com.jacandre.questions._0002_add_two_numbers.AddTwoNumbers;
import com.jacandre.questions._0002_add_two_numbers.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AddTwoNumbersTest {
    @Test
    void testAddTwoNumbers() {
        var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        var solver = new AddTwoNumbers();
        var result = solver.addTwoNumbers(l1, l2);
        assertLinkedListEquals(result, new int[] {7, 0, 8});
    }

    private void assertLinkedListEquals(ListNode node, int[] expected) {
        for (int val : expected) {
            assertNotNull(node);
            assertEquals(val, node.val);
            node = node.next;
        }
        assertNull(node);
    }
}
