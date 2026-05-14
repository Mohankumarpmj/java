class MyTask implements Runnable {
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" Count is: "+i);
            try{
                Thread.sleep(500);
            } catch(InterruptedException e){
                System.out.println("Interrupted Exception");
            }
            Thread.yield();
        }
    }
}

class Test {
    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t1 = new Thread(task,"Thread-A");
        Thread t2 = new Thread(task,"Thread-B");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch(InterruptedException e){
            System.out.println("Main Interrupted");
        }

        System.out.println("t1 alive: "+t1.isAlive());
        System.out.println("t2 alive: "+t2.isAlive());

        System.out.println("Both threads finished execution");
    }
}