package ru.ncedu.wortellen.FundamentalProgrammingStructures;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        convertToBin(num);
        convertToOctal(num);
        convertToHexadecimal(num);

        //если я правильно понял, что от меня требуется
        System.out.println("2^-10 as a hexadecimal floating-point: " +0x1.0p-10);
    }
    public static void convertToBin(int num){
        int bin=0;
        int count = 1;
        while(num>0){
            bin+=num%2*count;
            count*=10;
            num/=2;
        }
        System.out.println("Binary: "+bin);
    }
    public static void convertToOctal(int num){
        int octal=0;
        int count = 1;
        while(num>0){
            octal+=num%8*count;
            count*=10;
            num/=8;
        }
        System.out.println("Octal: "+octal);
    }
    public static void convertToHexadecimal(int num){
        StringBuilder hexadecimal= new StringBuilder();
        char[] div = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','F'};
        while(num>0){
            hexadecimal.insert(0, div[num % 16]);
            num/=16;
        }
        System.out.println("hexadecimal: "+hexadecimal);
    }
}
