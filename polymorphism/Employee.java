abstract class Employe{
    String name;
    double basesalary;

    Employe(String name,double basesalary){
        this.name=name;
        this.basesalary=basesalary;
    }
    abstract double calculatesalary();

    void display(){
        System.out.println("The Employee name is:"+name);
        System.out.println("The FinalSalary is :"+calculatesalary());
    }
}

class FulltimeEmployee extends Employe{
    FulltimeEmployee(String name,double basesalary){
        super(name, basesalary);
    }
   @Override double calculatesalary(){
    return basesalary+5000;
   }
}

class ParttimeEmployee extends Employe{
    ParttimeEmployee(String name,double basesalary){
        super(name, basesalary);
    }
    @Override double calculatesalary(){
        return basesalary*0.5;
    }
}

class ContractEmployee extends Employe{
    ContractEmployee(String name,double basesalary){
        super(name, basesalary);
    }
    @Override double calculatesalary(){
        return basesalary*1.2;
    }
}

public class Employee{
    public static void main(String[] args) {
        FulltimeEmployee f1=new FulltimeEmployee("Mohan",10000);
        ParttimeEmployee p1=new ParttimeEmployee("kumar",50000);
        ContractEmployee c1=new ContractEmployee("Siva",25000);
       f1.display();
       p1.display();
       c1.display();
    }
}