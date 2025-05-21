import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] arr = s.split("[^a-zA-Z]+");
        int count = 0;
        for (String word : arr) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);
        for (String word : arr) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }
        scan.close();
    }
}

