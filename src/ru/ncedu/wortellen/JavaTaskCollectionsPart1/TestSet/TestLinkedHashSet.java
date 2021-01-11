package ru.ncedu.wortellen.JavaTaskCollectionsPart1.TestSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static final int SIZE=100000;
    public static void main(String[] args) {
        Set<Integer> testSet = new LinkedHashSet<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            testSet.add(i);
        }
        long endTime = System.nanoTime();
        long differenceAdd = endTime - startTime;
        System.out.println("Add time : " + differenceAdd);


        startTime = System.nanoTime();
        for (int i = SIZE-1; i >= 0; i--) {
            testSet.remove(i);
        }
        endTime = System.nanoTime();
        long differenceRemove = endTime - startTime;
        System.out.println("Remove time : " + differenceRemove);

    }
}
