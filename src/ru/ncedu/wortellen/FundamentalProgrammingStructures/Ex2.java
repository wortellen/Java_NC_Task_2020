package ru.ncedu.wortellen.FundamentalProgrammingStructures;

import java.util.Scanner;

import static java.lang.Math.floorMod;

public class Ex2 {
    public static void main(String[] args) {
        convertAngle1(0);
        convertAngle1(45);
        convertAngle1(245);
        convertAngle1(2356);
        convertAngle1(-35);
        convertAngle1(-3533);
        convertAngle2(0);
        convertAngle2(45);
        convertAngle2(245);
        convertAngle2(2356);
        convertAngle2(-35);
        convertAngle2(-3533);
    }
    public static void convertAngle1(int num){
        System.out.println((num%360+360)%360);
    }
    public static void convertAngle2(int num){
        System.out.println(floorMod(num,360));
    }
}
