package com.burda.hw15.task1;

public class MyList<E> {
    private MyNode<E> head;
    private MyNode<E> tail;
    private int size;

    public void add(E value) {
        final MyNode<E> newNode = new MyNode<E>(value);
        if (head == null) {
            head = newNode;
        }
        if (tail != null) {
            MyNode<E> temp = this.tail;
            temp.next = newNode;
            newNode.prev = temp;
        }
        tail = newNode;
        this.size++;
    }

    public Integer getFromLast(E value) {
        int index = size;
        for (MyNode<E> x = tail; x != null; x = x.prev) {
            index--;
            if (value.equals(x.value))
                return index;
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
