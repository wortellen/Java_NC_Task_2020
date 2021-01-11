package ru.ncedu.wortellen.JavaTaskCollectionsPart1.TestList;

import ru.ncedu.wortellen.JavaTaskCollectionsPart1.DataNullException;
import ru.ncedu.wortellen.JavaTaskCollectionsPart1.ILinkedList;
import ru.ncedu.wortellen.JavaTaskCollectionsPart1.IncorrectIndexException;
import ru.ncedu.wortellen.JavaTaskCollectionsPart1.MyLinkedList;


public class TestMyLinkedList {
    public static final int SIZE=100000;
    public static void main(String[] args) throws DataNullException, IncorrectIndexException {
        ILinkedList<Integer> testList = new MyLinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            testList.add(i);
        }
        long endTime = System.nanoTime();
        long differenceAdd = endTime - startTime;
        System.out.println("Add time : " + differenceAdd);


        startTime = System.nanoTime();
        for (int i = SIZE-1; i >= 0; i--) {
            testList.remove(i);
        }
        endTime = System.nanoTime();
        long differenceRemove = endTime - startTime;
        System.out.println("Remove time : " + differenceRemove);


        startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            int center=i/2;
            testList.add(center,i);
        }
        endTime = System.nanoTime();
        long differenceAddCenter = endTime - startTime;
        System.out.println("Add in center time : " + differenceAddCenter);


        startTime = System.nanoTime();
        for (int i = SIZE-1; i >= 0; i--) {
            int center=i/2;
            testList.remove(center);
        }
        endTime = System.nanoTime();
        long differenceRemoveCenter = endTime - startTime;
        System.out.println("Remove in center time : " + differenceRemoveCenter);
    }
}
