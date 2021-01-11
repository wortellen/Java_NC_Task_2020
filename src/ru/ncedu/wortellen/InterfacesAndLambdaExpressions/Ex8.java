package ru.ncedu.wortellen.InterfacesAndLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("d");
        list.add("s");
        list.add("q");
        luckySort(list,String::compareToIgnoreCase );
    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp)
    {
        int i=1;
        while (!isSorted(strings, comp))
        {
            Collections.shuffle(strings);
            System.out.println("try "+i);
            i++;
        }
    }
    public static boolean isSorted(ArrayList<String> list, Comparator<String> comp)
    {
        String o1, o2;
        for (int i = 0; i < list.size() - 1; i++)
        {
            o1 = list.get(i);
            o2 = list.get(i + 1);
            if (comp.compare(o1, o2) > 0)
                return false;
        }
        return true;
    }
}
