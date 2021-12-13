package com.burda.hw14.task1;

public class MyNode<E> {
    public E value;
    public MyNode<E> next;
    public MyNode<E> prev;

    public MyNode(E value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "value=" + value +
                '}';
    }
}
