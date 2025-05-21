import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
    public static boolean isValidRegex(String regex){
        try{
            Pattern.compile(regex);
            return true;
        }catch(PatternSyntaxException e){
            return false;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            if(isValidRegex(pattern)){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
            testCases--;
        }
        in.close();
    }
}




