package ru.ncedu.wortellen.FundamentalProgrammingStructures;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int int1 = s.nextInt();
//        int int2 = s.nextInt();
//        int int3 = s.nextInt();
        int int1 = 36;
        int int2 = 35;
        int int3 = 33;
        printLargest1(int1,int2,int3);
        printLargest2(int1,int2,int3);
    }
    public static void printLargest1(int num1,int num2,int num3){
        if(num1>num2) {
            if (num1 > num3)
                System.out.println(num1);
        }
        else if(num2>num3)
            System.out.println(num2);
        else System.out.println(num3);
    }
    public static void printLargest2(int num1,int num2,int num3){
        System.out.println(Math.max(Math.max(num1,num2),num3));
    }

}
