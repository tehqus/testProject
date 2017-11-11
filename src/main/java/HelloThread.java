package main.java;

public class HelloThread extends Thread {

    A a = new A();
    @Override
    public void run() {
        while (true) {
            System.out.println("check");
        }
    }

}
