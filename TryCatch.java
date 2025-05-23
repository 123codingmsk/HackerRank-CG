import java.util.*;

public class TryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try(Scanner scn = new Scanner(System.in)){
            int num1 = scn.nextInt();
            int num2 = scn.nextInt();

            int res = num1/num2;
            System.out.println(res);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }catch(Exception e){
            System.out.println("Unexpected Exception: "+e);
        }
    }
}