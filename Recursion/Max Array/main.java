import java.util.Scanner;

public class main {

    public static int maxArr(int []arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int recAns =  maxArr(arr, idx+1);
        int mySelf = arr[idx];
        if(mySelf > recAns){
            return mySelf;
        }else{
            return recAns;
        }
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans = maxArr(arr, 0);
        System.out.println(ans);
    }
}
