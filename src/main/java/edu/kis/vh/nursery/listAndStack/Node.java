package edu.kis.vh.nursery.listAndStack;

public final class Node {


    private int value;
    private Node prev, next;

    Node(int i) {
        setValue(i);
    }

    int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    Node getPrev() {
        return prev;
    }

    void setPrev(Node prev) {
        this.prev = prev;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
