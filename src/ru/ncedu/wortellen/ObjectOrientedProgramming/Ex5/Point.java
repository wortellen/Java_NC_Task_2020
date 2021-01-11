package ru.ncedu.wortellen.ObjectOrientedProgramming.Ex5;

public class Point {
    double x=0;
    double y=0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() { }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double deltaX, double deltaY){
        x+=deltaX;
        y+=deltaY;
        return this;
    }

    public Point scale(double k){
        x*=k;
        y*=k;
        return this;
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("("+p.getX()+","+p.getY()+")");

    }
}
