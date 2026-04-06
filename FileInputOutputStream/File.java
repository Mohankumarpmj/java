import java.io.*;

public class File {

public static void main(String[] args) throws IOException {

// Writing to a file

FileOutputStream fos = new FileOutputStream("hello.txt");

String msg = "Hello, Java I/O!";

String msg1="Hello mohankumar";

fos.write(msg1.getBytes()); // convert String to bytes

fos.close();

// Reading from the file

FileInputStream fis = new FileInputStream("hello.txt");

int b;

while ((b = fis.read()) != -1) { // -1 = end of file

System.out.print((char) b); // cast byte → char

}

fis.close();

}

}