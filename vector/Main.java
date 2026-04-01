import java.util.*;
public class Main {
    public static void intMenu() {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        int choice;
        do {
            System.out.println("\n--- INTEGER VECTOR MENU ---");
            System.out.println("1. Create Vector");
            System.out.println("2. Insert Element");
            System.out.println("3. Get Length");
            System.out.println("4. Delete Element");
            System.out.println("5. Increase Capacity");
            System.out.println("6. Print Elements");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    v.clear(); // recreate
                    System.out.println("Vector created (empty).");
                    break;
                case 2:
                    System.out.print("Enter integer: ");
                    v.add(sc.nextInt());
                    System.out.println("Inserted.");
                    break;
                case 3:
                    System.out.println("Size: " + v.size());
                    break;
                case 4:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < v.size()) {
                        v.remove(idx);
                        System.out.println("Deleted.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 5:
                    System.out.print("Enter new capacity: ");
                    int cap = sc.nextInt();
                    v.ensureCapacity(cap);
                    System.out.println("Capacity increased if needed.");
                    break;
                case 6:
                    System.out.println("Elements: " + v);
                    break;
                 case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);
    }
    public static void stringMenu() {
        Scanner sc = new Scanner(System.in);
        Vector<String> v = new Vector<>();
        int choice;
        do {
            System.out.println("\n--- STRING VECTOR MENU ---");
            System.out.println("1. Create Vector");
            System.out.println("2. Insert Element");
            System.out.println("3. Get Length");
            System.out.println("4. Delete Element");
            System.out.println("5. Increase Capacity");
            System.out.println("6. Print Elements");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer
            switch (choice) {
                case 1:
                    v.clear();
                    System.out.println("Vector created (empty).");
                    break;
                case 2:
                    System.out.print("Enter string: ");
                    v.add(sc.nextLine());
                    System.out.println("Inserted.");
                    break;
                case 3:
                    System.out.println("Size: " + v.size());
                    break;
                case 4:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < v.size()) {
                        v.remove(idx);
                        System.out.println("Deleted.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    System.out.print("Enter new capacity: ");
                    int cap = sc.nextInt();
                    v.ensureCapacity(cap);
                    System.out.println("Capacity increased if needed.");
                    break;
                case 6:
                    System.out.println("Elements: " + v);
                    break;
                case 7:
                    System.out.println("Exiting...");
                   break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Data Type:");
        System.out.println("1. Integer");
        System.out.println("2. String");
        int choice = sc.nextInt();
        if (choice == 1) {
            intMenu();
        } else if (choice == 2) {
            stringMenu();
        } else {
            System.out.println("Invalid choice!");
        }
    }
}