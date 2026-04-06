import java.io.*;
class CountByte{
public static void main(String[] args) throws IOException {

        FileOutputStream fos=new FileOutputStream("Welcome.txt");
        String msg="Welcome to the Great Girikalan magic show";
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