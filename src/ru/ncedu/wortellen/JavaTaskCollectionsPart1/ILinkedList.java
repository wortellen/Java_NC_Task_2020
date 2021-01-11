package ru.ncedu.wortellen.JavaTaskCollectionsPart1;

public interface ILinkedList<E> extends Iterable{
    void add(E element) throws DataNullException;
    void add(int index,E element) throws IncorrectIndexException, DataNullException;
    void clear();
    E get(int index) throws IncorrectIndexException;
    void remove (int index) throws IncorrectIndexException;
    E set(int index, E element) throws IncorrectIndexException, DataNullException;
    int size();
    E[] toArray();
    String toString();
}
