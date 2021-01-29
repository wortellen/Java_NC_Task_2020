package ru.ncedu.wortellen.JavaTaskCollectionsPart1;



import java.util.Iterator;


public class MyLinkedList<E> implements ILinkedList<E>{
    private Node<E>  head;
    private Node<E>  tail;
    private int size=0;

    public void add(E element) throws DataNullException {
        if(element==null)
            throw new DataNullException("Data is Null");
        Node<E> node =new Node<>(element);
        if(head==null){
            head=node;
        }
        else{
            tail.nextNode=node;
        }
        tail=node;
        size++;
    }
    public void add(int index,E element) throws IncorrectIndexException, DataNullException {
        if(element==null)
            throw new DataNullException("Data is Null");
        if (index > size) {
            throw new IncorrectIndexException("Error. INDEX>SIZE");
        }
        if ((index == 0 && size == 0) || index == size) {
            add(element);
            return;
        }
        if (index == 0){
            head = new Node<>(element, head);
            size ++;
            return;
        }
        Node<E> cursor = head;
        for (int i = 0; i < index-1; i++){
            cursor.setNextNode(cursor.getNextNode());
        }
        Node<E> node =new Node<>(element,cursor.nextNode);
        cursor.setNextNode(node);
        size++;
    }
    public void clear(){
        head=null;
        tail=null;
        size=0;
    }
    public E get(int index) throws IncorrectIndexException {
        if (index > size) {
            throw new IncorrectIndexException("Error. INDEX>SIZE");
        }
        if(index==size)
            return tail.getElement();
        Node<E> cursor = head;
        for (int i = 0; i < index; i++){
            cursor.setNextNode(cursor.getNextNode());
        }
        return cursor.getElement();
    }
    public void remove (int index) throws IncorrectIndexException {
        if (index > size) {
            throw new IncorrectIndexException("Error. INDEX>SIZE");
        }
        if(index==0) {
            head.setNextNode(head.getNextNode());
            size--;
        }
        else if(index==size){
            Node<E> cursor = head;
            for (int i = 0; i < index-1; i++){
                cursor.setNextNode(cursor.getNextNode());
            }
            tail=cursor;
            tail.setNextNode(null);
            size--;
        }
        else{
            Node<E> cursor = head;
            for (int i = 0; i < index-1; i++){
                cursor.setNextNode(cursor.getNextNode());
            }
            cursor.setNextNode(cursor.nextNode.nextNode);
            size--;
        }

    }
    public E set(int index, E element) throws IncorrectIndexException, DataNullException {
        if(element==null)
            throw new DataNullException("Data is Null");
        if (index > size) {
            throw new IncorrectIndexException("Error. INDEX>SIZE");
        }
        if ((index == 0 && size == 0) || index == size) {
            add(element);
            return element;
        }
        if (index == 0){
            head = new Node<>(element, head);
            size ++;
            return element;
        }
        Node<E> cursor = head;
        for (int i = 0; i < index; i++){
            cursor.setNextNode(cursor.getNextNode());
        }
        Node<E> node =new Node<>(element,cursor.nextNode);
        cursor.setNextNode(node);
        return element;

    }
    public int size(){
        return size;
    }



    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = head; x != null; x = x.nextNode)
            result[i++] = x.element;

        if (a.length > size)
            a[size] = null;
        return a;
    }

    public String toString(){
        Node<E> cursor = head;
        if(size==0)
            return "MyLinkedList[]";
        StringBuilder sb =new StringBuilder("MyLinkedList[");
        for(int i=0;i<size;i++){

            sb.append(cursor.toString()).append(",");
            //cursor=cursor.nextNode;
            cursor.setNextNode(cursor.getNextNode());
        }
        return sb.substring(0,sb.length()-1)+"]";
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() throws IndexOutOfBoundsException {
                E result = current.getElement();
                current = current.getNextNode();
                return result;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

}
