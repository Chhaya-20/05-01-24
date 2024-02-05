import java.util.*;

public class Titles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> a = new ArrayList<String>();

        String userInput;
        do {
            System.out.print("Enter a string (type 'exit' to stop): ");
            userInput = sc.nextLine();

            // Add the entered string to the ArrayList if it's not "exit"
            if (!userInput.equalsIgnoreCase("exit")) {
                a.add(userInput);
            }

        } while (!userInput.equalsIgnoreCase("exit"));
        String ans = "";
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).length(); j++) {
                // System.out.println(a.get());
                char c = a.get(i).charAt(j);
                // System.out.println(c);
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    if (j == 0) {
                        ans = ans + Character.toUpperCase(c);

                    } else if (!Character.isAlphabetic(a.get(i).charAt(j - 1))) {
                        ans = ans + Character.toUpperCase(c);
                        // ans = ans + a[i].charAt(j).toupp

                    } else {
                        ans = ans + c;
                    }
                } else if (!Character.isDigit(c)) {
                    // System.out.println("hello");
                    ans = ans + c;
                }

            }
            sc.close();

        }
        System.out.println(ans);
        // if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
    }

}
