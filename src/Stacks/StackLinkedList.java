package Stacks;

import java.util.LinkedList;

public class StackLinkedList<T> {

    private final LinkedList<T> list;
    private final int capacity;

    public StackLinkedList(int capacity) {
        this.list = new LinkedList<>();
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public boolean isFull() {
        return this.list.size() == this.capacity;
    }

    public void push(T value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        this.list.add(value);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return this.list.removeLast();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return this.list.getLast();
    }

    public void deleteStack() {
        this.list.clear();
    }
}
