import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
class Student{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        FileOutputStream fos=new FileOutputStream("students.dat");
        int rollno;
        String name;
        double marks;
        System.out.println("Enter the number of students:");
        int n=scan.nextInt();
        System.out.println("Enter the details of students:");
        for(int i=0;i<n;i++){
            System.out.println("Enter roll number:");
            rollno=scan.nextInt();
            System.out.println("Enter name:");
            name=scan.next();
            System.out.println("Enter marks:");
            marks=scan.nextDouble();
        }
    }
}