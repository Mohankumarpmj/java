import java.io.*;
class Example {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        bw.write("Line 1");
        bw.newLine();
        bw.write("Line 2");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}