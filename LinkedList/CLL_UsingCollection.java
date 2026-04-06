import java.util.*;

class CLL_UsingCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Circular Traversal (2 rounds):");

        int size = list.size();

        for(int i = 0; i < size * 2; i++) {
            System.out.print(list.get(i % size) + " -> ");
        }

        System.out.println("(repeats)");
    }
}