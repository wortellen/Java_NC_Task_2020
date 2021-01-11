package ru.ncedu.wortellen.FundamentalProgrammingStructures;


import java.util.Arrays;
import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
        int[] data = new int[49];
        int[] ticket = new int[6];
        for(int i=0;i<49;i++){
            data[i]=i+1;
        }
        Random r = new Random();
        for(int i=0;i<6;i++){
            int tmp = r.nextInt(49);
            if(data[tmp]!=-1) {
                ticket[i] = data[tmp];
                data[tmp]=-1;
            }
        }
        Arrays.sort(ticket);
        for(int i=0;i<6;i++){
            System.out.print(ticket[i]);
        }
    }
}
