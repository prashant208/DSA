import java.util.Scanner;

public class twodarraydemo {

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

    public static void display(int[][]arr){
        Scanner scn = new Scanner(System.in);
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        input(arr);
        display(arr);
    }
}
