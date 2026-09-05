package edu.psu.se411.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void push_push_pop_returns_latest_element() {

        Stack<String> stringStack = new Stack<>();

        stringStack.push("Z");
        stringStack.push("A");

        assertEquals("A", stringStack.pop());
    }

    @Test
    public void pop_empty_stack() {

        Stack<String> stringStack = new Stack<>();

        NoSuchElementException thrown =
                assertThrows(
                        NoSuchElementException.class,
                        () -> stringStack.pop(),
                        "Expected pop from empty Stack to throw, but it didn't"
                );

        assertTrue(
                thrown.getMessage().equals(
                        "Stack is empty, cannot pop"
                )
        );
    }
    
    @Test
    public void pushed_elements_are_popped_in_reverse_order() {

        Stack<String> stringStack = new Stack<>();

        stringStack.push("First");
        stringStack.push("Second");
        stringStack.push("Third");

        assertEquals("Third", stringStack.pop());
        assertEquals("Second", stringStack.pop());
        assertEquals("First", stringStack.pop());
    }
}