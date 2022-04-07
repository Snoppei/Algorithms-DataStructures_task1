package com.company;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackGenericsTest {

    @org.junit.jupiter.api.Test
    void push() {
        StackGenerics stack = new StackGenerics(2);
        stack.push(9);
        stack.push(7);
        stack.push(6);
        assertEquals(6, stack.pop());
        assertEquals(7, stack.pop());
        assertEquals(9, stack.pop());
    }

    @org.junit.jupiter.api.Test
    void pop() {
        StackGenerics stack = new StackGenerics();
        stack.push(1);
        assertEquals(1, stack.pop());

    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        StackGenerics stack = new StackGenerics();
        stack.push(3);
        stack.push(4);
        assertEquals(false, stack.isEmpty());
        stack.pop();
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void isFull() {
        StackGenerics stack = new StackGenerics(3);
        stack.push(3);
        stack.push(4);
        assertEquals(false, stack.isFull());
        stack.pop();
        stack.pop();
        assertEquals(false, stack.isFull());
        stack.push(3);
        stack.push(4);
        stack.push(3);
        assertEquals(true, stack.isFull());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        StackGenerics stack = new StackGenerics();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
        assertEquals(2, stack.peek());
        stack.pop();
        assertEquals(1, stack.peek());
        assertEquals(1, stack.peek());
    }
}