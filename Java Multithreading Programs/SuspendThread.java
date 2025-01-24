public class SuspendThread {
    public static void main(String[] args) {
        ControlledThread controlledThread = new ControlledThread();
        Thread thread = new Thread(controlledThread, "ControlledThread");

        thread.start();

        try {
            Thread.sleep(2000); // Let the thread run for 2 seconds
            controlledThread.suspendThread();

            System.out.println("Thread suspended.");

            Thread.sleep(2000); // Suspend the thread for 2 seconds
            controlledThread.resumeThread();

            System.out.println("Thread resumed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ControlledThread implements Runnable {
    private boolean suspended = false;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                while (suspended) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            // Simulate some work
            System.out.println("Thread is running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void suspendThread() {
        suspended = true;
    }

    public synchronized void resumeThread() {
        suspended = false;
        notify();
    }
}
