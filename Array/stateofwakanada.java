import java.util.Scanner;

public class stateofwakanada {
    public static void input(int[][]arr){
        Scanner scn = new Scanner(System.in);
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void sow(int [][]arr){
        Scanner scn = new Scanner(System.in);
        int n = arr.length;
        int m = arr[0].length;
        for(int j=0; j<m; j++){
            if(j%2==0){
                for(int i=0; i<n; i++){
                    System.out.println(arr[i][j] + "");
                }
            }else{
                for(int i=n-1; i>=0; i--){
                    System.out.println(arr[i][j] + "");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        input(arr);
        sow(arr);
    }
}
