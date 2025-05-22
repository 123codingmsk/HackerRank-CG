import java.util.*;
public class JavaHashSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> uniq = new HashSet<>();
        for(int i=0; i<t; i++){
            String name = "";
            name = pair_left[i].compareTo(pair_right[i]) > 0 ? pair_left[i]+" "+pair_right[i] : pair_right[i]+" "+pair_left[i];
            uniq.add(name);
            System.out.println(uniq.size());
        }
//Write your code here

    }
}