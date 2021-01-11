package ru.ncedu.wortellen.FundamentalProgrammingStructures;

import java.util.ArrayList;
import java.util.Scanner;
/*
пример true:
16 3 2 13
5 10 11 8
9 6 7 12
4 15 14 1

*/
public class Ex14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> tmp = new ArrayList<>();
        while (true){
            String str= s.nextLine();
            if(!str.equals(""))
                tmp.add(str);
           else break;
        }
        int[][] matrix = new int[tmp.size()][tmp.size()];
        for(int i=0;i<matrix.length;i++){
            String[] tmp1 = (tmp.get(i).split(" "));
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=Integer.parseInt(tmp1[j]);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(isMagicSquare(matrix));
    }
    public static boolean isMagicSquare(int[][] matrix){
        int sum = 0;
        int sumC=0;
        int sumR=0;
        int sumD1=0;
        int sumD2=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[0][i];
        }
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix.length; j++){
                sumC+=matrix[i][j];
                sumR+=matrix[j][i];
                sumD1+=matrix[j][j];
                sumD2+=matrix[matrix.length-1-j][matrix.length-1-j];
            }
            if(sum!=sumC||sum!=sumR||sum!=sumD1||sum!=sumD2)
                return false;
            sumC=0;
            sumR=0;
            sumD1=0;
            sumD2=0;
        }
        return true;
    }
}
