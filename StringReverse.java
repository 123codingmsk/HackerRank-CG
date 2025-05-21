import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);
        String revstr = sb.reverse().toString();

        if(A.equals(revstr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}



