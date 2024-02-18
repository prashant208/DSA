import java.util.Scanner;
public class rotateby90deg {

    public static void swap(int i, int j, int [][]arr){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void transpose(int [][]arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                swap(i, j, arr);
            }
        }
    }

    public static void reverse(int []oneD){
        int i=0;
        int j=oneD.length - 1;
        while(i<j){
            int temp = oneD[i];
            oneD[i] = oneD[j];
            oneD[j] = temp;
            i++;
            j--;
        }
    }

    public static void reverseRow(int [][]arr){
        for(int []row : arr){
            reverse(row);
        }
    }

    public static void rotate(int [][]arr){
        transpose(arr);
        reverseRow(arr);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        rotate(arr);
    }
}
