package ru.ncedu.wortellen.FundamentalProgrammingStructures;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //сами операции делаются без long, но без такого смещения я не знаю, как еще сделать
        long offset= 2147483648L;
        Scanner s = new Scanner(System.in);
        int a = (int) (s.nextLong()-offset);
        int b = (int) (s.nextLong()-offset);
        System.out.println((a+offset)+(b+offset));
        System.out.println((a+offset)-(b+offset));
        System.out.println((a+offset)*(b+offset));
        System.out.println((a+offset)/(b+offset));
        System.out.println((a+offset)%(b+offset));
    }
}
