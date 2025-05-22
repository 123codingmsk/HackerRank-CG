import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int num = scn.nextInt();
            list.add(num);
        }

        int NoOfQueries = scn.nextInt();
        while(NoOfQueries > 0){
            String q = scn.next();

            if(q.toLowerCase().equals("insert")){
                int a = scn.nextInt();
                int b = scn.nextInt();

                list.add(a, b);
            }
            if(q.toLowerCase().equals("delete")){
                int delind = scn.nextInt();
                list.remove(delind);
            }
            NoOfQueries--;
        }
        for(int l : list){
            System.out.print(l+" ");
        }
    }
}