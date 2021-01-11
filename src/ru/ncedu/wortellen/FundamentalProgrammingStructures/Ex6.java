package ru.ncedu.wortellen.FundamentalProgrammingStructures;

import java.math.BigInteger;

public class Ex6 {
    public static void main(String[] args) {
        int n=1000;
        BigInteger b =BigInteger.valueOf(1);
        while(n>0){
            b=b.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(b);
    }
}
