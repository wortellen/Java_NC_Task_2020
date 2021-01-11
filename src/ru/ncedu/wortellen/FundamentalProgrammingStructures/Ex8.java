package ru.ncedu.wortellen.FundamentalProgrammingStructures;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        for (int i = 0; i < str.length(); i++)
            for (int j = i+1; j <= str.length(); j++)
                System.out.println(str.substring(i, j));
    }
}
