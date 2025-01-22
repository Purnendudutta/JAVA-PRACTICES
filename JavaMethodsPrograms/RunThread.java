class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
public class RunThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Starts a new thread and runs the `run()` method
    }
}
