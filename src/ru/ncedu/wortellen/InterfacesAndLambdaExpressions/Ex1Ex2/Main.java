package ru.ncedu.wortellen.InterfacesAndLambdaExpressions.Ex1Ex2;

import javax.imageio.stream.ImageOutputStream;
import java.util.Scanner;

/*
К заданию 2:
    Приведение типов необходимо, тк без него доступны только методы суперкласса т.е. только getMeasure()
    А метод getName() существует только для Employee
* */
public class Main {
    public static void main(String[] args) {
        Measurable e1= new Employee(1,"qwerty","qwerty",10000);
        Measurable e2= new Employee(2,"qwerty","qwerty",20000);
        Measurable e3= new Employee(3,"qwerty","qwerty",30000);
        Measurable e4= new Employee(4,"qwerty","qwerty",40000);
        Measurable e5= new Employee(5,"largest","salary",50000);
        Measurable[] obj = {e1,e2,e3,e4,e5};

        System.out.println(average(obj));
        Employee e = (Employee) largest(obj);
        System.out.println(e.getName());
    }
    public static double average(Measurable[] objects){
        double average = 0;
        for(Measurable i:objects){
            average+=i.getMeasure();
        }
        average/=objects.length;
        return average;
    }
    public static Measurable largest(Measurable[] objects){
        double max = 0;
        Measurable e= new Employee(1,"qwerty","qwerty",10000);;
        for(Measurable i:objects){
            if(i.getMeasure()>max){
                max=i.getMeasure();
                e=i;
            }
        }
        return e;
    }
}
