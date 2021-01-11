package ru.ncedu.wortellen.InterfacesAndLambdaExpressions;

public class Ex4 {
    public static void main(String[] args) {
        //анонимный внутренний класс
        IntSequence is = new IntSequence() {
            @Override
            public void of(int... seq) {
                for(int i:seq){
                    System.out.print(i+",");
                }
            }
        };
        //лямбда-выражение
        IntSequence test = seq -> {
            for(int i:seq){
                System.out.print(i+",");
            }
        };
        is.of(1,3,3,3,45,34,234,543,521,312);
        System.out.println();
        test.of(1,3,3,3,45,34,234,543,521,312);


    }
    public static interface IntSequence {
        void of(int... seq);
    }
}

