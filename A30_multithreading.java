class thread1 extends Thread{
    public void run(){
        System.out.println("Child Name = "+this.getName());
        System.out.println("Thread is running");
    }
}
public class A30_multithreading {
    public static void main(String[] args) {
        System.out.println("priority = "+Thread.currentThread().getName());
        thread1 t1 = new thread1();
        t1.setName("childthread");
        t1.start();
    }
}