class Shape{
    String color;
    String name;
    int sno;

    void display(){
    System.out.println("The ");
    }
    static int countInfo(){


    }
}

class 2DShape extends Shape{
    abstract double getArea()
}
class 3DShape extends Shape{
    doube Volume;

    abstract double getVolume()
    
}
class Circle extends 2DShape{

    Circle(String colour,String name, int radius){
        this.colour=colour;
        this.name=name;
        this.radius=radius;
    }
    double getArea(){
        int area=radius * radius;

    }

}

class Cuboid extends 3DShape{
    
}