import java.util.*;
class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        HashSet<String> set = new HashSet<>();
        for (String w : words) {
            set.add(w);
        }
        System.out.println("Unique words:");
        for (String w : set) {
            System.out.println(w);
        }
    }
}
class Remove{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
    }
}