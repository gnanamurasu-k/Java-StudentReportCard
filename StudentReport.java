import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / (double) n;
        String grade;

        if (average >= 90)      grade = "A+";
        else if (average >= 80) grade = "A";
        else if (average >= 70) grade = "B";
        else if (average >= 60) grade = "C";
        else                    grade = "F";

        System.out.println("\n--- Report Card ---");
        System.out.println("Name   : " + name);
        System.out.println("Total  : " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade  : " + grade);

        sc.close();
    }
}
