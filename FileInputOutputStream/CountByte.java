import java.io.*;
import java.util.Scanner;
class CountByte {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        FileOutputStream fos1 = new FileOutputStream("File1.txt");
        FileOutputStream fos2 = new FileOutputStream("File2.txt");
        System.out.println("Enter the text for First file:");
        String msg = scan.nextLine();
        fos1.write(msg.getBytes());
        fos1.close();
        System.out.println("Enter the text for the Second file:");
        String msg1 = scan.nextLine();
        fos2.write(msg1.getBytes());
        fos2.close();
        FileInputStream fis1 = new FileInputStream("File1.txt");
        FileInputStream fis2 = new FileInputStream("File2.txt");
        int b, a;
        int vowelcount = 0;
        int count = 0;
        boolean isIdentical = true;
        System.out.println("\nProcessing First File Characters:");
        while (true) {
            b = fis1.read();
            a = fis2.read();
            if (b == -1 && a == -1) {
                break;
            }
            if (b != a) {
                isIdentical = false;
            }
            if (b != -1) {
                count++;
                char c = (char) b;
                char lowerCh = Character.toLowerCase(c);
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowelcount++;
                }
                if (Character.isLowerCase(c)) {
                    System.out.println("The Uppercase of '" + c + "' is: " + Character.toUpperCase(c));
                } else {
                    System.out.println("Character is not lowercase: " + c);
                }
            }
        }
        if (isIdentical) {
            System.out.println("\nResult: The Files are Identical!");
        } else {
            System.out.println("\nResult: The Files are NOT Identical.");
        }
        System.out.println("The Number of Bytes in First File: " + count);
        System.out.println("The number of Vowels in First File: " + vowelcount);
        fis1.close();
        fis2.close();
        scan.close();
    }
}