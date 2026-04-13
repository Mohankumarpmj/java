import java.io.*;
public class File {
public static void main(String[] args) throws IOException {
FileOutputStream fos = new FileOutputStream("hello.txt");
String msg = "Hello, Java I/O!";
String msg1="Hello mohankumar";
fos.write(msg1.getBytes());
fos.close();
FileInputStream fis = new FileInputStream("hello.txt");
int b;
while ((b = fis.read()) != -1) { 
System.out.print((char) b); 
}
fis.close();
}
}