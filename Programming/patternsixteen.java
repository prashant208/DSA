import java.util.Scanner;

public class patternsixteen {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=0;
        int l=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k+"\t");
                int c = k + l;
                k = l;
                l = c;
            }
            System.out.println();
        }
    }
}
