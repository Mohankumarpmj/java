import java
import java.util.Scanner; util.Scanner;
class create {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.prnlnt("Enter the size:");
        n=scan.nextInt();
        int []array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.println(array[i] + " ");
        }
        for(int i=0;i<n;i++){
            sum+=arra[i];
        }
        System.out.println("The sum of the array is:");
    }
}