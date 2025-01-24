public class ThreadStatusCheck {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableTask(), "MyThread");

        System.out.println("Thread status before starting: " + thread.getState());
        thread.start();
        System.out.println("Thread status after starting: " + thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread status after completion: " + thread.getState());
    }
}

class RunnableTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000); // Simulate some work with sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
