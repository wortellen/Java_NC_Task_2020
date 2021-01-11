package ru.ncedu.wortellen.FundamentalProgrammingStructures;

public class Ex5 {
    public static void main(String[] args) {
        //Преобразует к максимальному значению int => будет равенство с Integer.MAX_VALUE
        double tmp = 3000000000.0;
        int tmp1 = (int)tmp;
        System.out.println(tmp1==Integer.MAX_VALUE);
    }
}
