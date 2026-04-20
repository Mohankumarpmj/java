import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner("10 20 30");
while (sc.hasNext()){
System.out.println(sc.next());
}
sc.close(); 
 } 
}