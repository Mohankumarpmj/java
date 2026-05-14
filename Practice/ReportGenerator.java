import java.util.ArrayList;
import java.util.List;
class Student {
    int rollNo;
    int cgpa;
    Student(int rollNo, int cgpa) {
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
}
class SharedData {
    private List<Student> students = new ArrayList<>();
    private int completedThreads = 0;
    private final int TOTAL_THREADS = 3;
    public synchronized void addStudent(int rollNo, int cgpa) {
        students.add(new Student(rollNo, cgpa));
        System.out.println(Thread.currentThread().getName()
                + " added -> Roll No: " + rollNo + " CGPA: " + cgpa);
    }
    public synchronized void threadCompleted() {
        completedThreads++;
        if (completedThreads == TOTAL_THREADS) {
            notify(); 
        }
    }
    public synchronized void generateReport() {
        try {
            while (completedThreads < TOTAL_THREADS) {
                wait(); 
            }
            int total = 0;
            System.out.println("\n----- FINAL REPORT -----");
            for (Student s : students) {
                System.out.println("Roll No: " + s.rollNo +
                        "  CGPA: " + s.cgpa);
                total += s.cgpa;
            }
            double avg = (double) total / students.size();
            System.out.println("\nAverage CGPA of Class = " + avg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class TutorThread extends Thread {
    private SharedData data;
    private int startRoll;
    TutorThread(SharedData data, int startRoll, String name) {
        super(name);
        this.data = data;
        this.startRoll = startRoll;
    }
    public void run() {
        for (int i = 0; i < 3; i++) {
            int roll = startRoll + i;
            int cgpa = (int)(Math.random() * 10) + 1;
            data.addStudent(roll, cgpa);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data.threadCompleted();
    }
}
public class ReportGenerator {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        TutorThread t1 = new TutorThread(data, 101, "Tutor-1");
        TutorThread t2 = new TutorThread(data, 201, "Tutor-2");
        TutorThread t3 = new TutorThread(data, 301, "Tutor-3");
        t1.start();
        t2.start();
        t3.start();
        data.generateReport();
    }
}