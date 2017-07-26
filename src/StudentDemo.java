import java.util.Scanner;

/**
 * Created by shree on 17/7/17.
 */
public class StudentDemo {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int rollNumber;
        String name;
        float marks;
        StudentData student = new StudentData();
        System.out.println("Enter student Details:-----\n");

        rollNumber = Integer.parseInt(scanner.nextLine());
        name = scanner.nextLine();
        marks = Float.parseFloat(scanner.nextLine());

        student.setRollNumber(rollNumber);
        student.setName(name);
        student.setMarks(marks);

        System.out.println(student.getRollNumber());
        System.out.println(student.getName());
         System.out.println(student.getMarks());

    }
}
