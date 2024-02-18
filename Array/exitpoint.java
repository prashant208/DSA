import java.util.Scanner;

public class exitpoint {

    public static void input(int[][]arr){
        Scanner scn = new Scanner(System.in);
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void main(int[][]arr){
        int dir=0;
        int i = 0;
        int j=0;
        while(true){
            dir = dir + arr[i][j];
            dir = dir%4;

            if(dir==0){
                //east
                j++;
            }
            else if(dir==1){
                //south
                i++;
            }else if(dir==2){
                //west
                j--;
            }else{
                //north
                i--;
            }

            if(i<0 || j<0 || i>arr.length || j>arr[0].length){
                break;
            }

            if(i<0){
                i++;
            }else if(j<0){
                j++;
            }else if(i>arr.length){
                i--;
            }else if(j>arr[0].length){
                j--;
            }

            System.out.println(i);
            System.out.println(j);
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        input(arr);
        exitpnt(arr);
    }
}
