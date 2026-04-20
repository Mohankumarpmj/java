 class Thread1 extends Thread{
 public void run(){
    System.out.println("Hi");
 }
}
 class Thread2 extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}
class Create {
    public static void mainn(String[] args){
        Thread1 obj1= new Thread1();
        Thread2 obj2=new Thread2();
        obj1.start();
        obj2.start();
    }
}