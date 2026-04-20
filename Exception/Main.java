class Main {
    public static void main(String[] args) {
        try {
            System.exit(0); // ❌ will exit the program immediately
            System.out.println("Try block");
        } finally {
            System.out.println("Finally block"); // ❌ will NOT run
        }
    }
}