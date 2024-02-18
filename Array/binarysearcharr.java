import java.util.Scanner;

public class binarysearcharr {

    public static int binarySearch(int []arr, int x){
        int i = 0;
        int j = arr.length - 1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x){
                j = mid -1;
            }else{
                i = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = 8;
        int []arr = {5,7,10,11,14,20,26,30};
        int x = scn.nextInt();
        int ans = binarySearch(arr, x);
        System.out.println(ans);
    }
}
