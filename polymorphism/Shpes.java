abstract class Shapess{
    abstract double area();

    void display(){
        System.out.println("The area of shapes is:"+area());
    }
}

class Circle extends Shapess{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shapess{
    double l,b;
    Rectangle(double l,double b){
        this.b=b;
        this.l=l;
    }
    @Override
     double area()
    {
      return l*b;
    }
}
public class Shpes {
    public static void main(String[] args) {
        Circle c1=new Circle(4);
        Rectangle r1=new Rectangle(4,4);
        c1.display();
        r1.display();
    }

    
}