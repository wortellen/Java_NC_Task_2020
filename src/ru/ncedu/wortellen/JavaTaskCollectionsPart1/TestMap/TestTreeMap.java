package ru.ncedu.wortellen.JavaTaskCollectionsPart1.TestMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static final int SIZE=100000;
    public static void main(String[] args) {
        Map<Integer, String> testMap = new TreeMap<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            testMap.put(i,Integer.toString(i));
        }
        long endTime = System.nanoTime();
        long differenceAdd = endTime - startTime;
        System.out.println("Add time : " + differenceAdd);


        startTime = System.nanoTime();
        for (int i = SIZE-1; i >= 0; i--) {
            testMap.remove(i);
        }
        endTime = System.nanoTime();
        long differenceRemove = endTime - startTime;
        System.out.println("Remove time : " + differenceRemove);
    }
}
