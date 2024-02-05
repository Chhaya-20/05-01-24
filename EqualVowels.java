import java.util.*;

public class EqualVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string - ");
        String s = sc.nextLine();
        int l = s.length() / 2;
        /// System.out.println(s.substring(0, l));
        String s1 = s.substring(0, l);
        String s2 = s.substring(l, s.length());
        // System.out.println(s1 + " " + s2);
        int c1 = 0, c2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
                    || s1.charAt(i) == 'u') {
                c1++;
            }
            if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o'
                    || s2.charAt(i) == 'u') {
                c2++;
            }
        }
        if (c1 == c2) {
            System.out.println("Same Vowel ");
        } else {
            System.out.println("Not same vowel");
        }
        sc.close();

    }

}
