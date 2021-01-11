package ru.ncedu.wortellen.JavaTaskCollectionsPart1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws DataNullException, IncorrectIndexException {
        ILinkedList<Integer> list = new MyLinkedList<>();
        list.add(3);
        list.remove(0);
        System.out.println(list.toString());
        /*//добавление в конец, set аналогично, не совсем понял, для чего этот метод
        list.add(3);
        list.add(82);
        list.add(623);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.toString());
        //добавление по инндексу
        list.add(0, 0);
        list.add(3,333);
        list.add(8,888);
        System.out.println(list.toString());
        //удаление
        list.remove(0);
        list.remove(5);
        list.remove(3);
        //size
        System.out.println(list.size());
        //tostring
        System.out.println(list.toString());
        //get
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        //iterator
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }*/


    }
}