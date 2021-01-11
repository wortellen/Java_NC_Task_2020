package ru.ncedu.wortellen.JavaTaskCollectionsPart1.TestSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static final int SIZE=100000;
    public static void main(String[] args) {
        Set<Integer> testSet = new TreeSet<>();
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
