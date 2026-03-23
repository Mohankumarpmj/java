import java.util.*;
public class example{
    public static void main(String[] args){
        /*try{
             int a;
             int b;
             Scanner scan=new Scanner(System.in);
             System.out.println("Enter the number for a:");
             a=scan.nextInt();
             System.out.println("Enter the number for b:");
             b=scan.nextInt();
        System.out.println(a/b);

        }
        catch(Exception e){
            System.out.println("Cannot divide by zero");
    
            }*/
      /*try {
    String s = null;
    System.out.println(s.length());
} catch (ArithmeticException e) {
    System.out.println("Arithmetic Error");
} catch (NullPointerException e) {
    System.out.println("Null Error");
}
*/
/*try {
    int x = 10 / 0;
} catch (Exception e) {
    System.out.println("General Exception");
} catch (ArithmeticException e) {
    System.out.println("Arithmetic Exception");
}
    }
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();
        while (true) {
            try {
                System.out.print("Enter denominator: ");
                int denominator = sc.nextInt();
                int result = numerator / denominator;
                System.out.println("Result: " + result);
                break; // exit loop if successful
            } catch (ArithmeticException exd) {
                System.out.println("Error: Division by zero is not allowed. Try again.");
            }
        }

        sc.close();
    }

}
