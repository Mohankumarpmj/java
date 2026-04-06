import java.util.Scanner;
class Bubble{
    public static void main(String [] args) {
      int n;
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the Size:");
      n=scan.nextInt();
      int []array=new int[n];
      for(int i=0;i<n;i++){
        array[i]=scan.nextInt();
      }
      for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++){
            if(array[j]>array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
      }
      System.out.println("Sorted array:");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }
}