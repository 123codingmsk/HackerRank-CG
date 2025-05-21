import java.util.*;

public class EOF {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line;
        int id = 1;
        while(scn.hasNext()){
            line = scn.nextLine();
            System.out.println(id+" "+line);
            id++;
        }
    }
}