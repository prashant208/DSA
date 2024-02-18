import java.util.Scanner;

public class patternone {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int Star = 1;
        int Space = n -1;
        for(int row=1; row<=n; row++){

            for(int cst=1; cst<=Star; cst++){
                System.out.print("*\t");
            }
            for(int csp=1; csp<=Space; csp++){
                System.out.print("\t");
            }

            Star++;
            Space--;

            System.out.println();
        }
    }
}