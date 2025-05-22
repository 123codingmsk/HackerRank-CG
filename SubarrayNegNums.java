import java.util.*;

public class SubarrayNegNums {

    public static int getTotNegNums(int[] arr, int num){
        int count = 0;
        for(int i=0; i<=num-1; i++){
            int sum = 0;
            for(int j=i; j<num; j++){
                sum = sum + arr[j];
                if(sum < 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = scn.nextInt();
        }

        //logic
        int ans = getTotNegNums(arr, num);
        System.out.println(ans);
    }
}