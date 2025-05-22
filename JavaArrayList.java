import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<int[]> lists = new ArrayList<>();

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        while(num > 0){
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            lists.add(arr);
            num--;
        }

        int NoOfqueries = scn.nextInt();

        while(NoOfqueries > 0){
            int q1 = scn.nextInt();
            int q2 = scn.nextInt();

            if (q1 <= lists.size() && q1 > 0) {
                int[] selected = lists.get(q1 - 1);
                if (q2 > 0 && q2 <= selected.length) {
                    System.out.println(selected[q2 - 1]);
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
            NoOfqueries--;
            //System.out.println(lists.get(q1-1)[q2]);
        }
    }
}
