package ru.ncedu.wortellen.InterfacesAndLambdaExpressions;

public class Ex10 {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runner1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runner2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runner3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        runTogether(r1, r2, r3);
        runInOrder(r1, r2, r3);
    }

    public static void runTogether(Runnable... tasks) {
        for (Runnable i : tasks) {
            new Thread(i).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable i : tasks) {
            i.run();
        }
    }
}
