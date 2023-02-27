import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int numGrades = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i+1) + ": ");
            double grade = scanner.nextDouble();
            sum += grade;
        }

        double average = sum / numGrades;
        System.out.println("Average grade: " + average);
    }
}
