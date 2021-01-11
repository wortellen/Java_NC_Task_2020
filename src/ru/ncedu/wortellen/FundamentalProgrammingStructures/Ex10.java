package ru.ncedu.wortellen.FundamentalProgrammingStructures;

import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        Random r = new Random();
        long value = r.nextLong();
        System.out.println(longBase64(value));
    }
    public static String longBase64(long value){
        StringBuilder base64= new StringBuilder();
        char[] div = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        while(value>0){
            base64.insert(0, div[(int)(value % 36)]);
            value/=36;
        }
        return base64.toString();
    }
}
