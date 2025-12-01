package src.Student;

import java.util.Scanner;

public class StdSeat {
    // Method that checks the index
    public static int getStudentId(int[] ids, int index)
        throws InvalidSeatNumberException {

        if (index < 0 || index >= ids.length) {
            throw new InvalidSeatNumberException(
                "Error: No student exists at that seat number."
            );
        }
        return ids[index];
    }

    
    public static void main(String[] args) {
        int[] stdIds = {101, 102, 103, 104, 105};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter index (0-" + (stdIds.length - 1) + "): ");
        int idx = sc.nextInt();   // read the index

        try {
            int id = getStudentId(stdIds, idx);
            System.out.println("Student ID at index " + idx + " = " + id);
        } catch (InvalidSeatNumberException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
