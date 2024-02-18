import java.util.Scanner;
public class spiralway {
    public static void input(int [][]arr){
        Scanner scn = new Scanner(System.in);
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void spiral(int[][]arr){
        Scanner scn = new Scanner(System.in);
        int n = arr.length;
        int m = arr[0].length;
        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = n-1;

        int count = 0;
        int total = n*m;

        while(count<total){
            //left
            for(int i =minr; i<=maxr && count<total; i++){
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;

            //bottom
            for(int j =minc; j<=maxc && count<total; j++){
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;

            //right
            for(int i=maxr; i>=minr && count<total; i--){
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;

            //top
            for(int j=maxc; j>=minc && count<total; j--){
                System.out.println(arr[minr][j]);
                count++;
            }
            minr++;
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        input(arr);
        spiral(arr);
    }
}
