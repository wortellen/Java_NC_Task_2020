package ru.ncedu.wortellen.InterfacesAndLambdaExpressions;

public class Ex5 {
    public static void main(String[] args) {
        //анонимный внутренний класс
        IntSequence is = new IntSequence() {
            @Override
            public void constant(int x) {
                while (true){
                    System.out.print(x+",");
                }
            }
        };
        //лямбда-выражение
        IntSequence test = x -> {
            while (true){
                System.out.print(x+",");
            }
        };
        //is.constant(1);
        test.constant(2);
    }
    public static interface IntSequence {
        void constant(int x);
    }
}
