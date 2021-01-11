package ru.ncedu.wortellen.ObjectOrientedProgramming.Ex9;

/*
класс не может быть immutable, потому что изменяются координаты и кол-во топлива
*/
public class Car {
    private double x;
    private double fuel;
    private final double fuelEfficiency;

    public Car(double fuel, double fuelEfficiency) {
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public  void move(int miles){
        if(fuel-miles*fuelEfficiency>=0) {
            fuel -= miles * fuelEfficiency;
            x += miles;
        }
        else{
            x+=fuel/fuelEfficiency;
            fuel=0;
            System.out.println("fuel ran out");
        }
    }

    public  void addGallons(double gallons){
        fuel+=gallons;
    }

    public double distance(){
        return x;
    }
    public double fuelLevel(){
        return fuel;
    }

    public static void main(String[] args) {
        Car c = new Car(10,1);
        c.move(6);
        System.out.println("distance: "+c.distance());
        System.out.println("fuel level: "+c.fuelLevel());
        c.move(10);
        System.out.println("distance: "+c.distance());
        System.out.println("fuel level: "+c.fuelLevel());
        c.addGallons(10);
        c.move(3);
        c.move(6);
        System.out.println("distance: "+c.distance());
        System.out.println("fuel level: "+c.fuelLevel());
        c.move(10);
        System.out.println("distance: "+c.distance());
        System.out.println("fuel level: "+c.fuelLevel());
    }
}

