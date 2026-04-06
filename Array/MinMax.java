import java.util.*;
/*
class MinMax{
    public static void main(String [] args){
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size:");
        n=scan.nextInt();
        int [] array=new int [n];
        for(int i=0;i<n;i++)
        {
            array[i]=scan.nextInt();
        }
        int max=array[0];
        int min=array[0];
        for(int i=0;i<n;i++){
            
        if(array[i]<min){
            min=array[i];
        }
        if(array[i]>max){
            max=array[i];
        }
    }
System.out.println("The maximum number:"+max);
System.out.println("The minimum number:"+min);
    }
}
    import java.util.Scanner;
*/
class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Frequency:");

        for (int i = 0; i < n; i++) {

            int count = 1;
            boolean visited = false;

            // check if already counted
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    visited = true;
                    break;
                }
            }

            if (visited)
                continue;

            // count occurrences
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}