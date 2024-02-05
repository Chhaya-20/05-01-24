import java.util.*;

public class AddStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string - ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string");
        String s2 = sc.nextLine();
        int i = s1.length() - 1;
        int j = s2.length() - 1, car = 0;
        String ans = "";

        while (i >= 0 || j >= 0) {
            int sum = car;
            if (i >= 0) {
                sum += s1.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += s2.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                ans = ans + (sum);
                car = 0;
            } else if (sum == 2) {
                ans = ans + ("0");
                car = 1;
            } else {
                ans = ans + ("1");
                car = 1;
            }
            i--;
            j--;
        }
        if (car == 1) {
            ans = ans + ("1");
        }
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(ans);

        // reverse StringBuilder input1
        input1.reverse();
        System.out.println(input1);
        sc.close();
    }

}
