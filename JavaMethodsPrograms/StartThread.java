class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
public class StartThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread
    }
}
