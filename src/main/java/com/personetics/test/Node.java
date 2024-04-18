package com.personetics.test;

import java.util.Objects;

public class Node<T> {
    private final T value;
    private Node<T> next;
    private Node<T> prev;

    public Node(final T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public char[] valueToCharArray() {
        return value.toString().toCharArray();
    }

    public Node<T> getPrev() {
        return prev;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public boolean isSingle() {
        return value.toString().length() == 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<T> node = (Node<T>) o;
        return Objects.equals(value, node.value)
            && Objects.equals(next, node.next)
            && Objects.equals(prev, node.prev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next, prev);
    }

    @Override
    public String toString() {
        return "Node{" +
            "value=" + value +
            ", next=" + (next != null ? next.value : null) +
            ", prev=" + (prev != null ? prev.value : null) +
            '}';
    }
}
