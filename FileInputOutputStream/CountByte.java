import java.io.*;
import java.util.Scanner;
class CountByte{
public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        FileOutputStream fos=new FileOutputStream("Welcome.txt");
        String msg;
        System.out.println("Enter the text to the file:");
        msg=scan.nextLine();
        fos.write(msg.getBytes());
        fos.close();
        FileInputStream fis=new FileInputStream("Welcome.txt");
        int b;
        int count=0;
        while((b=fis.read())!=-1){
            count++;
        }
         System.out.println("The Number of Byte's in the File's:" +count);
        fis.close();
    }
}