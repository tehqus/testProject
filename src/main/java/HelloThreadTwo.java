package main.java;

public class HelloThreadTwo extends Thread {

    @Override
    public void run() {
        while(true) {
            System.out.println("BLA");
        }
    }
}
