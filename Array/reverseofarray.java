import java.util.*;

public class reverseofarray {

    public static void swap(int []arr, int n){
        int []b = new int[n];
        int j=n;
        for(int i=0; i<n; i++){
            b[j-1] = arr[i];
            j--;
        }

        for (int k = 0; k < n; k++) { 
            System.out.println(b[k]); 
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        swap(arr, arr.length);
    }
}
