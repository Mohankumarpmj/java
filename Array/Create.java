import java.util.Scanner;
public class Create{
    public static void main(String[] args){

        /*Creation of Array*/
        Scanner scan= new Scanner(System.in);
        System.out.println("ARRAY METHOD'S");
        System.out.println("Enter the number of array:");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the number's for an array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        /*display*/
        System.out.println("The array is :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        /*Sum*/
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of the array is :" +sum);


    }
}