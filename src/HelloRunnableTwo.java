public class HelloRunnable implements Runnable {

    private static Integer count=0;

    public void run() {
        while(true) {
            count++;
            System.out.println(count);

        }
    }

    public static void main(String args[]) {
        (new Thread (new HelloRunnable())).start();
    }




}