import java.util.*;

public class Static {
    static boolean flag;
    static int B, H;
    static {
        Scanner scn = new Scanner(System.in);
        B = scn.nextInt();
        H = scn.nextInt();

        if(B <= 0 || H <= 0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            flag = true;
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }//end of main

}//end of class

