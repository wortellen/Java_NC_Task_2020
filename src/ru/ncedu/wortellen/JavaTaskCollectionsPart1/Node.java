package ru.ncedu.wortellen.JavaTaskCollectionsPart1;

public class Node<E> {
    E element;
    Node nextNode;

    public Node() {
    }

    public Node(E element) {
        this.element = element;
    }

    public Node(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node(E element, Node nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    @Override
    public String toString(){
        return "Node{" +
                "data=" + element +
                '}';
    }
}
