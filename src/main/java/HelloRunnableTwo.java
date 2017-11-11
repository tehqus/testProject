package main.java;

public class HelloRunnableTwo implements Runnable {

    private static Integer count=0;

    public void run() {
        while(true) {
            count++;
            System.out.println('a');

        }
    }

    public static void main(String args[]) {
        (new Thread (new HelloRunnableTwo())).start();
    }




}

