import java.util.Vector;

public class GFG{
    
    public static void main(String[] args){
        
        Vector<String> v = new Vector<>(7,2);
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        v.add("F");
        v.add("G");
        v.add("H");
        v.add("I");
        v.add("J");
        System.out.println(v);
        System.out.println(v.get(1));
        System.out.println(v.size());
        System.out.println(v.remove(2));
        System.out.println(v);
        System.out.println(v.contains("A"));
        System.out.println("v.capacity() : " + v.capacity());
    }
}