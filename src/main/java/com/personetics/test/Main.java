package com.personetics.test;

import java.util.List;

import static com.personetics.test.NodeListBuilder.build;

public class Main {
    public static void main(String [] args) {
        List<Node<Integer>> nodes1 = build(36, 6, 24, 4, 47, 7, 2, 3, 27);
        List<Node<String>> nodes2 =
            build("p", "aba", "a", "b", "perso", "o", "r", "e", "s");
        List<Node<Integer>> nodes3 = build(35, 5, 65, 6, 24, 4);

        ChainValidator chainValidator = new ChainValidator();

        System.out.println("> Chain Validator: ");
        println(nodes1, chainValidator.validate(nodes1));
        println(nodes2, chainValidator.validate(nodes2));
        println(nodes3, chainValidator.validate(nodes3));
    }

    private static <T> void println(List<Node<T>> nodes, boolean isValid) {
        System.out.println(
            " - List [" + listAsString(nodes) + "] is valid? " + isValid);
    }

    private static <T> String listAsString(List<Node<T>> nodes) {
        return nodes.stream()
            .map(node -> node.getValue().toString())
            .reduce("",
                (result, value) ->
                    result.isEmpty() ? value : result + ", " + value);
    }
}
