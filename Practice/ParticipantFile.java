import java.io.*;
import java.util.Scanner;
public class ParticipantFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos =
                    new FileOutputStream("participants.dat");
            DataOutputStream dos =
                    new DataOutputStream(fos);
            int n = 5;
            System.out.println("Enter Participant Details:\n");
            for (int i = 0; i < n; i++) {
                System.out.println("Participant " + (i + 1));
                System.out.print("Roll No: ");
                String roll = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("College Name: ");
                String college = sc.nextLine();
                System.out.print("City: ");
                String city = sc.nextLine();
                System.out.print("Phone No: ");
                int phone = Integer.parseInt(sc.nextLine());
                dos.writeUTF(roll);
                dos.writeUTF(name);
                dos.writeUTF(college);
                dos.writeUTF(city);
                dos.writeInt(phone);
             System.out.println();
            }
            dos.close();
            fos.close();
            System.out.println("Data written to participants.dat");
            FileInputStream fis =
                    new FileInputStream("participants.dat");
            DataInputStream dis =
                    new DataInputStream(fis);
            FileOutputStream cityfos =
                    new FileOutputStream("City.dat");
            DataOutputStream citydos =
                    new DataOutputStream(cityfos);
            System.out.print("\nEnter city to filter: ");
            String targetCity = sc.nextLine();
            int count = 0;
            System.out.println("\nParticipants from " + targetCity);
            try {
                while (true) {
                    String roll = dis.readUTF();
                    String name = dis.readUTF();
                    String college = dis.readUTF();
                    String city = dis.readUTF();
                    int phone = dis.readInt();
                    if (city.equalsIgnoreCase(targetCity)) {
                        citydos.writeUTF(roll);
                        citydos.writeUTF(name);
                        citydos.writeUTF(college);
                        citydos.writeUTF(city);
                        citydos.writeInt(phone);
                        count++;
                        System.out.println("----------------------");
                        System.out.println("Roll No : " + roll);
                        System.out.println("Name    : " + name);
                        System.out.println("College : " + college);
                        System.out.println("City    : " + city);
                        System.out.println("Phone   : " + phone);
                    }
                }

            } catch (EOFException e) {
            }
            dis.close();
            fis.close();
            citydos.close();
            cityfos.close();
            System.out.println("\nTotal entries added to City.dat = "
                    + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
