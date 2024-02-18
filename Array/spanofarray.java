import java.util.Scanner;

public class spanofarray {

    public static int span(int []arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

         for(int i =0; i<arr.length; i++){
            int currVal = arr[i];
            if(currVal > max){
                max = currVal;
            }else if(currVal < min){
                min = currVal;
            }
         }

        return max-min;

        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans = span(arr);
        System.out.println(ans);
    }
}