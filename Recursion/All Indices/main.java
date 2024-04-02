import java.util.Scanner;

public class main {
    public static int[] allIndices(int []arr, int x, int idx, int count) {
        if(idx == arr.length){
            int []base = new int[count];
            return base;
        }
        if(x == arr[idx]){
            count = count + 1;
        }
        int []recAns = allIndices(arr, x, idx+1, count);

        if(x == arr[idx]){
            recAns[count-1] = idx;
        }
        return recAns;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int []iarr = allIndices(arr, x, 0, 0);
        if(iarr.length == 0){
            System.out.println();
            return;
        }
        for(int i=0; i<iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }
}
