import java.util.*;

class ScoreEarned {
    public static void main(String ags[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array - ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 5) {
                ans = ans + 5;
            } else if (a[i] % 2 == 0) {
                ans = ans + 1;
            } else {
                ans = ans + 3;
            }
        }
        System.out.println("Score is " + ans);
        sc.close();
    }

}
