import java.util.ArrayList;
import java.util.Scanner;

class GenericMinMax {

    // Generic Swap
    public static <T> void swap(ArrayList<T> list) {
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(n - 1 - i));
            list.set(n - 1 - i, temp);
        }
    }

    // Find Max
    public static <T extends Comparable<T>> T findMax(ArrayList<T> list) {
        T max = list.get(0);
        for (T val : list) {
            if (val.compareTo(max) > 0) {
                max = val;
            }
        }
        return max;
    }

    // Find Min
    public static <T extends Comparable<T>> T findMin(ArrayList<T> list) {
        T min = list.get(0);
        for (T val : list) {
            if (val.compareTo(min) < 0) {
                min = val;
            }
        }
        return min;
    }

    // Count Occurrence
    public static <T> int countOccurrence(ArrayList<T> list, T key) {
        int count = 0;
        for (T val : list) {
            if (val.equals(key)) {
                count++;
            }
        }
        return count;
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

                processList(intList, sc);
                break;

            case 2:
                ArrayList<Float> floatList = new ArrayList<>();
                System.out.println("Enter Float values:");
                for (int i = 0; i < n; i++) {
                    floatList.add(sc.nextFloat());
                }

                processList(floatList, sc);
                break;

            case 3:
                ArrayList<String> strList = new ArrayList<>();
                System.out.println("Enter String values:");
                for (int i = 0; i < n; i++) {
                    strList.add(sc.next());
                }

                processList(strList, sc);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }

    // Common processing method
    public static <T extends Comparable<T>> void processList(ArrayList<T> list, Scanner sc) {

        System.out.println("Before swap: " + list);
        swap(list);
        System.out.println("After swap: " + list);

        System.out.println("Max: " + findMax(list));
        System.out.println("Min: " + findMin(list));

        System.out.print("Enter element to count: ");
        T key = list.get(0); // placeholder (we override below)

        if (key instanceof Integer) {
            key = (T) (Integer) sc.nextInt();
        } else if (key instanceof Float) {
            key = (T) (Float) sc.nextFloat();
        } else {
            key = (T) sc.next();
        }

        System.out.println("Occurrence: " + countOccurrence(list, key));
    }
}