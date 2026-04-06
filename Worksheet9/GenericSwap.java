import java.util.ArrayList;
import java.util.Scanner;

class GenericSwap {

    public static <T> void swap(ArrayList<T> list) {
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(n - 1 - i));
            list.set(n - 1 - i, temp);
        }
    }

    public static <T> void print(ArrayList<T> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, n;

        System.out.println("Choose Data Type:");
        System.out.println("1. Integer\n2. Float\n3. String");
        choice = sc.nextInt();

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        switch (choice) {

            case 1:
                ArrayList<Integer> intList = new ArrayList<>();
                System.out.println("Enter Integer values:");
                for (int i = 0; i < n; i++) {
                    intList.add(sc.nextInt());
                }

                System.out.println("Before swap: " + intList);
                swap(intList);
                System.out.println("After swap: " + intList);
                break;

            case 2:
                ArrayList<Float> floatList = new ArrayList<>();
                System.out.println("Enter Float values:");
                for (int i = 0; i < n; i++) {
                    floatList.add(sc.nextFloat());
                }

                System.out.println("Before swap: " + floatList);
                swap(floatList);
                System.out.println("After swap: " + floatList);
                break;

            case 3:
                ArrayList<String> strList = new ArrayList<>();
                System.out.println("Enter String values:");
                for (int i = 0; i < n; i++) {
                    strList.add(sc.next());
                }

                System.out.println("Before swap: " + strList);
                swap(strList);
                System.out.println("After swap: " + strList);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}