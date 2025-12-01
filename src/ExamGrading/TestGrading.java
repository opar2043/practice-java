package src.ExamGrading;

import java.util.Scanner;

public class TestGrading {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        System.out.print("Enter exam score: ");
        int score = nm.nextInt();
        // GradeSystem grade = new GradeSystem();

        try {
            GradeSystem.GradeScroe(score);
        } catch (InvalidException e) {
            System.out.println("Invalid score: " + e.getMessage());
        }

        nm.close();
    }
}
