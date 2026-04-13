import java.Scanner.*;
public class For{
    public static vaid main(String[] args){
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("*");
            }
        }
    }
    
}