import java.util.Scanner;

public class StringCharecter {
    int vowel = 0, consonant = 0, specialchar = 0, digit = 0;

    void classifyString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char fristChar = str.charAt(i);

            // Check if it is a letter
            if ((fristChar >= 'a' && fristChar <= 'z') || (fristChar >= 'A' && fristChar <= 'Z')) {
                fristChar = Character.toLowerCase(fristChar);
                if (fristChar == 'a' || fristChar == 'e' || fristChar == 'i' ||
                    fristChar == 'o' || fristChar == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
            // Check if it is a digit
            else if (fristChar >= '0' && fristChar <= '9') {
                digit++;
            }
            // Otherwise special character
            else {
                specialchar++;
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Digits: " + digit);
        System.out.println("Special characters: " + specialchar);
    }

    public static void main(String[] args) {
        StringCharecter nameInput = new StringCharecter();
        Scanner nam = new Scanner(System.in);

        System.out.println("Enter name / anything else");
        String str = nam.nextLine();

        nameInput.classifyString(str);

        nam.close();
    }
}
