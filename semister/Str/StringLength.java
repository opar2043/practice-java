package semister.Str;

import java.util.Scanner;

public class StringLength {
    int vowel = 0, consonant = 0, specialchar = 0, digit = 0;


    // Method to classify string
    void StringClassify(String str) {
        System.out.println(str);
        String lower = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char fst = lower.charAt(i);
            if (fst >= 'a' && fst <= 'z') {
                if (fst == 'a' || fst == 'e' || fst == 'i' || fst == 'o' || fst == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            } else if (fst >= '0' && fst <= '9') {
                digit++;

            } else {
                specialchar++;
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Digits: " + digit);
        System.out.println("Special characters: " + specialchar);
    }

    public static void main(String[] args) {
        StringLength str = new StringLength();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String name = sc.nextLine();
        System.out.println("Name of the String is : " + name.length());
        str.StringClassify(name);
    }
}
