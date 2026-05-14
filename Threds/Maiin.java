class MyTask implements Runnable {

    @Override
    public void run() {

        // current thread info
        System.out.println("Running thread: " + Thread.currentThread().getName());

        // Check if alive
        System.out.println("Is alive: " + Thread.currentThread().isAlive());

        // Loop to show execution
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);

            try {
                // sleep method
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }

            // yield (hint to scheduler)
            Thread.yield();
        }
    }
}

public class Maiin {
    public static void main(String[] args) {

        // Create Runnable task
        MyTask task = new MyTask();

        // Create Thread objects
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        // Set priority
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        // Start threads
        t1.start();
        t2.start();

        try {
            // join (main waits for t1 to finish)
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }

        // Check if alive
        System.out.println("t1 alive: " + t1.isAlive());
        System.out.println("t2 alive: " + t2.isAlive());

        // Interrupt thread
        t2.interrupt();

        // current thread (main)
        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}