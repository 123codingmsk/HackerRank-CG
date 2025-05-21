import java.io.*;
import java.math.*;
public class JavaBigInteger {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String num2 = br.readLine();

        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
