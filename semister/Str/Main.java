package semister.Str;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);

        System.out.println(str.charAt(0));
        String str2 = str + "!";
        System.out.println(str2);

        // =============================
        char[] chars = { 'H', 'e', 'l', 'l', 'o' };

        for (char c : chars) {
            System.out.print(c); // Hello
        }

        // =============================
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2); // false (different objects)
        System.out.println(s1.equals(s2));

        // =============================
        String str1 = "Bank";
        str1.concat(" Account");
        System.out.println(str1); // "Bank" (not changed)

        // =============================
        String text = "SecurityCheck";
        System.out.println("Length: " + text.length());
        System.out.println("Substring: " + text.substring(0, 8));
        System.out.println("Character at index 2: " + text.charAt(2));
    }
}