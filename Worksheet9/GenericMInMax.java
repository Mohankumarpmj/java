import java.util.ArrayList;
import java.util.Scanner;

import Exception.example;
class Swap{
    int count=0;
    void Str(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("Before swapping: " + list);
        for(int i=0;i<list.size();i++){
            if
        }
        
        System.out.println("The maximum occurrence element is: " + list);
}
     void swapforStr(int i, int j, ArrayList<String> list){
        String  temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    void Float(){
        ArrayList<Float> list = new ArrayList<>();
        list.add(1.0f);
        list.add(2.0f);
        list.add(3.0f);
        list.add(4.0f);
        list.add(5.0f);
        System.out.println("Before swapping: " + list);
        for(int i=0;i<list.size();i++){
        }
        
        System.out.println("After swapping: " + list);
}
     void swapforFloat(int i, int j, ArrayList<Float> list){
        Float  temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
        list.add("E");
        System.out.println("Before swapping: " + list);
        for(int i=0;i<list.size();i++){
        }
        
        System.out.println("After swapping: " + list);
}
     
void Integer(){
     ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Before swapping: " + list);
        for(int i = 0; i < list.size(); i++) {
        }
     System.out.println("After swapping: " + list);
}
     void  swapforinteger(int i, int j, ArrayList<Integer> list) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
 class GenericMinMax{
    public static void main(String[] args) {
        int Choice ;
        System.out.println("Enter the number for String or Integer: \n 1. for String \n 2. for Integer  \n 3. for Float");
        Scanner sc = new Scanner(System.in);
        Choice = sc.nextInt();
        if(Choice == 1){
        new Swap().Str();
        }
        else if(Choice == 2){
            new Swap().Integer();
        }
         else if(Choice == 3){
            new Swap().Float();
        else{
            System.out.println("Invalid Choice");
        }
        new Swap().Integer();
    }
}