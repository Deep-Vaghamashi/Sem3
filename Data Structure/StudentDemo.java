import java.util.Scanner;

class Student_Detail {
    int Enrollment_No;
    String Name;
    int Semester;
    double CPI;
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student_Detail[] students = new Student_Detail[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student_Detail();
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enter Enrollment No: ");
            students[i].Enrollment_No = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Name: ");
            students[i].Name = scanner.nextLine();

            System.out.print("Enter Semester: ");
            students[i].Semester = scanner.nextInt();

            System.out.print("Enter CPI: ");
            students[i].CPI = scanner.nextDouble();
            scanner.nextLine(); 
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Details of student " + (i + 1) + ":");
            System.out.println("Enrollment No: " + students[i].Enrollment_No);
            System.out.println("Name: " + students[i].Name);
            System.out.println("Semester: " + students[i].Semester);
            System.out.println("CPI: " + students[i].CPI);
            System.out.println();
        }

        scanner.close();
    }
}
