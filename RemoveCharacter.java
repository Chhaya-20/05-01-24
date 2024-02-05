import java.util.*;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string - ");
        String s = sc.nextLine();
        String ans = "";
        char c = s.charAt(0);
        ans = ans + c;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                ans = ans + s.charAt(i);
                c = s.charAt(i);
            }

        }
        System.out.println("Answer String is  " + ans);
        sc.close();
    }

}
