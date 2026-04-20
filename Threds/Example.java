class RunnableClass implements Runnable{
     @Override 
      public void run()
    {
        System.out.println("Inside run method");
    }
}
class Example{
    public static void main(String[] args){
        RunnableClass obj=new RunnableClass();
        RunnableClass obj1=new RunnableClass();
        Thread t=new Thread (obj,"Hello");
        Thread t1=new Thread(obj1,"Hi");
        t.start();
        t1.start();
         System.out.println(t.getName());
        System.out.println(t.currentThread().getName());
        System.out.println(t1.getName());
        System.out.println(t1.currentThread().getName());
    }
    }