# Chain Validator

There are two kind of lists, each for a different type of values.

* First type: a list of one digit and two-digit numbers,
* Second type: a list of words and single characters consist of a-z letters 
  (only lower case).

A list can either be of the first or second type, but not mixed with both.

Multiple digits/letters objects have dependency on single digit/letters objects 
which are they consist of.

For example, the number 24 is dependent on two objects: 2 and 4, the word “aba”
is dependent on two objects: “a” and “b”.

## Examples

* Valid chain: 36, 6, 24, 4, 47, 7, 2, 3, 27
* Valid chain: “p”, “aba”, ”a”, ”b”, “perso”, “o”, “r”, “e”, “s”
* Invalid chain: 35, 5, 65, 6, 24, 4, (number 2 is missing).

Note: You don’t have to take care of: “a”, 5, “asd” (or any mixed values list).

## Components

The following components are part of the solution.

### com.personetics.test.Main

Responsible for executing the tests. The samples presented here are tested in
_Main#main()_ method.

### com.personetics.test.NodeListBuilder

NodeListBuilder#build() is the method responsible for the _List<Node<T>>_
creation. The method receives several strings/integers and builds the node´s 
list. 

### com.personetics.test.Node

This class holds values, that will be used during the chain validation process.

### com.personetics.test.ChainValidator

ChainValidator#validate() method checks if a given _List<Node<T>>_ received 
meets the validation requirements. 