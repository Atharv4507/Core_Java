class thread2 extends Thread{
    public void run(){
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class thread3 extends Thread{
    public void run(){
        for (int i = 5; i >= 1; i--) {
            System.out.println("\t"+i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class A32_MultithreadingMultitasking {
    public static void main(String[] args) {
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();
        t2.start();
        t3.start();
    }
}
