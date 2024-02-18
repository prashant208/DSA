import java.util.Scanner;

public class patternfourteen {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=scn.nextInt();
        for(int  i =1; i<=n; i++){
            k=i;
            for(int j=1; j<=n; j++){
                if(j<=i){
                    System.out.print("*\t", k);
                    if(j<n){
                        k++;
                    }else{
                        k--;
                    }
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
