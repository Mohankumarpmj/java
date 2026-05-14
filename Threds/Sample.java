class Task implements Runnable{
    public void run(){
        System.out.println("Running thread: " + Thread.currentThread().getName());

        System.out.println("The Running Thread is still alive:" +Thread.currentThread().isAlive());

       for(int i=1;i<=10;i++){
        System.out.println(Thread.currentThread().getName()+"---Count----"+i);
             }
      try {
                // sleep method
                Thread.sleep(500);
            }catch(InterruptedException e) {
                System.out.println("Thread interrupted");
            }

            // yield (hint to scheduler)
            Thread.yield();
   }
}

public class Sample {
    public void main(String[] args){
        Task task=new Task();
    // Create Thread objects
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        // Set priority
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

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