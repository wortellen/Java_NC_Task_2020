package ru.ncedu.wortellen.JavaTaskCollectionsPart1.TestList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    public static final int SIZE=100000;
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();

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
