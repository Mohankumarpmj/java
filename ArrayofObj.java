import java.util.ArrayList;
import java.util.Scanner;

class ListMenuProgram<T> {
    private ArrayList<T> list = new ArrayList<>();

    // Create list
    public void create(ArrayList<T> elements) {
        list.clear();
        list.addAll(elements);
        System.out.println("List created successfully!");
    }

    // Insert element at start
    public void insert(T val) {
        list.add(0, val);
        System.out.println("Element inserted.");
    }

    // Delete element
    public void delete(T val) {
        if (list.remove(val)) {
            System.out.println("Element deleted.");
        } else {
            System.out.println("Element not found.");
        }
    }

    // Increase size
    public void increaseSize(ArrayList<T> elements) {
        list.addAll(elements);
        System.out.println("Size increased.");
    }

    // Print list
    public void print() {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("Elements in the list:");
            for (T x : list) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    // Get length
    public void length() {
        System.out.println("Length of the list: " + list.size());
    }
}

public class ArrayofObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Use Object to allow any type (String, Integer, etc.)
        ListMenuProgram<Object> obj = new ListMenuProgram<>();

        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Create List");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Increase Size");
            System.out.println("5. Print Elements");
            System.out.println("6. Get Length");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter number of elements: ");
                    int n = sc.nextInt();
                    sc.nextLine(); // consume newline
                    ArrayList<Object> list1 = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter element (String or Integer): ");
                        String input = sc.nextLine();
                        list1.add(parseInput(input));
                    }
                    obj.create(list1);
                    break;

                case 2:
                    System.out.print("Enter element to insert: ");
                    String input2 = sc.nextLine();
                    obj.insert(parseInput(input2));
                    break;

                case 3:
                    System.out.print("Enter element to delete: ");
                    String input3 = sc.nextLine();
                    obj.delete(parseInput(input3));
                    break;

                case 4:
                    System.out.print("How many elements to add? ");
                    int m = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Object> list2 = new ArrayList<>();
                    for (int i = 0; i < m; i++) {
                        System.out.print("Enter element (String or Integer): ");
                        String input = sc.nextLine();
                        list2.add(parseInput(input));
                    }
                    obj.increaseSize(list2);
                    break;

                case 5:
                    obj.print();
                    break;

                case 6:
                    obj.length();
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }

    // Helper method to parse input as Integer if possible, otherwise String
    public static Object parseInput(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return input;
        }
    }
}