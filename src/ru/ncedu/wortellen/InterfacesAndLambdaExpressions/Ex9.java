package ru.ncedu.wortellen.InterfacesAndLambdaExpressions;

public class Ex9 {
    public static void main(String[] args) {
        Greeter("net",100);
        Greeter("cracker",100);
    }
    public static void Greeter(String target, int n){
        Runnable r = ()->{
            for(int i=0;i<n;i++){
                System.out.println("Hello, "+target);
            }
        };
        new Thread(r).start();
    }
}
