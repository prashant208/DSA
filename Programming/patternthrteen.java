import java.util.Scanner;

public class patternthrteen {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int  k =4;
        for(int i = 1; i<=n; i++){
            if(i<=3){
                k--;
            }else{
                k++;
            }
            for(int j=1; j<=n; j++){
                if(j==k || j==6-k){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
