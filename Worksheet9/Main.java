import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Before swapping: " + list);
        for(int i = 0; i < list.size()/2; i++) {
            swap(i, list.size()-1-i, list);
        }
        System.out.println("After swapping: " + list);
    }
    public static void swap(int i, int j, ArrayList<Integer> list) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}