import java.util.Scanner;

public class subarr {

    public static void subArray(int []arr){
        int n = arr.length;
        for(int st=0; st<n; st++){
            for(int end = st; end<n; end++){
                for(int k=st; k<=end; k++){
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }
    public static void main(String args []){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        subArray(arr);
    }
}
