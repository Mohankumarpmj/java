import java.util.*;
public class HashSetHashMaplab {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Remove Duplicate Words");
            System.out.println("2. Find Common Words");
            System.out.println("3. Count Words Starting with Vowel");
            System.out.println("4. HashSet Case Sensitivity");
            System.out.println("5. Word Frequency Counter");
            System.out.println("6. Character Frequency");
            System.out.println("7. Most Frequent Word");
            System.out.println("8. Student Email Directory");
            System.out.println("9. Check Anagram");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1: removeDuplicates(); break;
                case 2: commonWords(); break;
                case 3: vowelWords(); break;
                case 4: caseSensitive(); break;
                case 5: wordFrequency(); break;
                case 6: charFrequency(); break;
                case 7: mostFrequentWord(); break;
                case 8: emailDirectory(); break;
                case 9: checkAnagram(); break;
                case 0: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }
    static void removeDuplicates() {
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
    static void commonWords() {
        System.out.println("Enter sentence 1:");
        String s1 = sc.nextLine();
        System.out.println("Enter sentence 2:");
        String s2 = sc.nextLine();
        HashSet<String> set = new HashSet<>(Arrays.asList(s1.split(" ")));
        System.out.println("Common words:");
        for (String w : s2.split(" ")) {
            if (set.contains(w)) {
                System.out.println(w);
            }
        }
    }
    static void vowelWords() {
        System.out.println("Enter sentence:");
        String input = sc.nextLine();

        HashSet<String> set = new HashSet<>(Arrays.asList(input.split(" ")));
        int count = 0;
        for (String w : set) {
            char ch = Character.toLowerCase(w.charAt(0));
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Words starting with vowel: " + count);
    }

    static void caseSensitive() {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("java");
        set.add("JAVA");

        System.out.println("Size = " + set.size());
        System.out.println("Elements: " + set);
    }

    static void wordFrequency() {
        System.out.println("Enter sentence:");
        String input = sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();

        for (String w : input.split(" ")) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    static void charFrequency() {
        System.out.println("Enter string:");
        String input = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (ch == ' ') continue;
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    static void mostFrequentWord() {
        System.out.println("Enter sentence:");
        String input = sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();

        for (String w : input.split(" ")) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        String maxWord = "";
        int max = 0;

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                maxWord = e.getKey();
            }
        }

        System.out.println("Most Frequent Word: " + maxWord);
    }

    // 8. Student Email Directory
    static void emailDirectory() {
        HashMap<String, String> map = new HashMap<>();

        while (true) {
            System.out.println("\n1. Add\n2. Search\n3. Display\n0. Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    map.put(name, email);
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String key = sc.nextLine();
                    System.out.println("Email: " + map.getOrDefault(key, "Not Found"));
                    break;

                case 3:
                    for (Map.Entry<String, String> e : map.entrySet()) {
                        System.out.println(e.getKey() + " -> " + e.getValue());
                    }
                    break;

                case 0:
                    return;
            }
        }
    }

    // 9. Check Anagram
    static void checkAnagram() {
        System.out.println("Enter string 1:");
        String s1 = sc.nextLine();

        System.out.println("Enter string 2:");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println("Not Anagram");
                return;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        if (map.isEmpty())
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}