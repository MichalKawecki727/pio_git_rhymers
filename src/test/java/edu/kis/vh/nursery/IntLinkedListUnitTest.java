package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListUnitTest {

    @Test
    public void testPushAndTop() {
        IntLinkedList list = new IntLinkedList();

        int value = 10;
        list.push(value);

        int result = list.top();
        Assert.assertEquals(value, result);
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());

        list.push(1);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testTopOnEmptyList() {
        IntLinkedList list = new IntLinkedList();

        int result = list.top();
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();

        int result = list.pop();
        Assert.assertEquals(-1, result);

        list.push(5);
        list.push(6);
        list.push(7);

        result = list.pop();
        Assert.assertEquals(7, result);

        result = list.pop();
        Assert.assertEquals(6, result);

        result = list.pop();
        Assert.assertEquals(5, result);

        Assert.assertTrue(list.isEmpty());

        result = list.pop();
        Assert.assertEquals(-1, result);
    }
}