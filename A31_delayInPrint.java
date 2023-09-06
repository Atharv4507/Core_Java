class RunDemo implements Runnable{
    public void run(){
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class A31_delayInPrint {
    public static void main(String[] args) {
        RunDemo r1 = new RunDemo();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
