import java.util.Scanner;

public class matrixmultiplication {

    public static void input(int[][]arr){
        Scanner scn = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void output(int[][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }
    }

    public static void multiply(int[][]a, int [][]b){
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;

        int [][]c = new int[r1][c2];

        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                int sum =0;
                for(int k=0; k<r2; k++){
                    sum = sum + a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        output(c);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][]a = new int[r1][c1];
        input(a);

        int r2 = scn.nextInt();
        int c2 = scn.nextInt();

        if(c1 != r2){
            System.out.println("Invalid Input");
        }else{
            int [][]b = new int[r2][c2];
            input(b);
            multiply(a, b);
        }
    }
}
