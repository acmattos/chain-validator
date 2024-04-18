package com.personetics.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChainValidator {
    public <T> boolean validate(List<Node<T>> nodes) {
        Node<T> multiple = null;
        Map<Character, Boolean> singleMap = new HashMap<>();
        // Prepare for validation: splitting single from multiple nodes
        for (Node<T> node: nodes) { // TC - O(n)
            if(node.isSingle()) {
                singleMap.put(
                    node.getValue().toString().toCharArray()[0], true);// TC - O(1)
            } else {
                if(multiple != null) {
                    multiple.setNext(node);
                    node.setPrev(multiple);
                }
                multiple = node;
            }
        }
        // TC - O(p*q) - Validating multiple nodes based on single ones
        while (multiple != null) { // TC - O(p)
            for (char c: multiple.valueToCharArray()) {//TC - O(q)
               if(singleMap.get(c) == null) { // O(1)
                   return false;
               }
            }
            multiple = multiple.getPrev();
        }
        return true;
    }
}
