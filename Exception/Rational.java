import java.util.Scanner;

class Rational{
    public static void main(String[] args){
        int numerator;
        int denominator;
        double Rational;
        Scanner scan =new Scanner(System.in);
        System.out.println("Eneter numerator:");
        numerator=scan.nextInt();
        while (true) {
        try{
            System.out.println("Enter denominator:");
            denominator=scan.nextInt();
            System.out.println("Try block will excuted");
            Rational=numerator/denominator;
            System.out.println("The Rational is:"+Rational);
            break;
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed. Try again.");
        }
        finally {
            System.out.println(
                "finally : i will execute always.");
        }
    }
}
}

