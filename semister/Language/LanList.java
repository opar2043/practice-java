package semister.Language;

import java.util.ArrayList;

public class LanList {
    public static void main(String[] args) {
        ArrayList<String> language = new ArrayList<>();
        language.add("Java");
        language.add("Python");
        language.add("C++");

        for (String l : language) {
            System.out.println(l);
        }
        
        language.remove("Python");
        System.out.println("After removing Python:");

        for (String l : language) {
            System.out.println(l);
        }
    }
}
