// Thread class implementation
class ThreadImpl extends Thread{
    @Override
    public void run(){       
        // Output: Thread Class Running
        System.out.println("Thread Class Running");
    }
}
// Runnable interface implementation
class RunnableThread implements Runnable{
    @Override
    public void run(){       
        // Output: Runnable Thread Running
        System.out.println("Runnable Thread Running");
    }
}
public class Geeks1{
    public static void main(String[] args){
        // Create and start Thread class thread
        ThreadImpl t1 = new ThreadImpl();
        t1.start();
        // Create and start Runnable interface thread
        RunnableThread r = new RunnableThread();
        Thread t2 = new Thread(r);
        t2.start();
        // Wait for both threads to complete
        try {
            t1.join(); // Wait for t1
            t2.join(); // Wait for t2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}