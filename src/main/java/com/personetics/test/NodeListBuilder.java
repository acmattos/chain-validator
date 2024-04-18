package com.personetics.test;

import java.util.ArrayList;
import java.util.List;

public class NodeListBuilder {
    @SafeVarargs
    public static <T> List<Node<T>> build(T... values) {
        List<Node<T>> nodes = new ArrayList<>();
        for (T value: values) { // TC - O(n)
            nodes.add(new Node<>(value)); // TC - O(1)
        }
        return nodes;
    }
}
