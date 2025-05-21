import java.util.*;

public class StringIntro {

    public static int lengthSum(String A, String B){
        int len = A.length() + B.length();
        return len;
    }

    public static String checkLexo(String A, String B){
        if(A.compareTo(B) > 0) {
            return "Yes";
        }
        return "No";
    }

    public static String capitalize(String A, String B){
        String res1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String res2 = B.substring(0,1).toUpperCase() + B.substring(1);

        return res1+" "+res2;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = lengthSum(A, B);
        System.out.println(sum);

        String s = checkLexo(A, B);
        System.out.println(s);

        String ans = capitalize(A, B);
        System.out.println(ans);
    }
}



