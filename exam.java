public class exam{
        String name;
        int rollno,a,b,c,d,e,total;
        
        public void display(String name,int rollno){
            this.name=name;
            this.rollno=rollno;
        }
        public int mark(int a,int b,int c,int d,int e){
            this.a=a;
            this.b=b;
            this.c=c;
            this.d=d;
            total=a+b+c+d;
            return total;
        }
        public void display(){
            System.out.println("-----------------------------");
            System.out.println("The name is:"+name);
            System.out.println("The Rollno is:"+rollno);
            System.out.println("A mark is:"+a);
            System.out.println("B mark is:"+b);
            System.out.println("C mark is:"+c);
            System.out.println("D mark is:"+d);
            System.out.println("E mark is:"+e);
        }
     public static void main(String args[]){
    exam s1=new exam();
    s1.display("Mohan",117);
    s1.mark(80,89,87,67,65);
    s1.display();

        }
    }
