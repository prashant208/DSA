import java.util.Scanner;

public class patterntwo {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int Space = n-1;;
        int Star = 1;

        for(int row=1; row<=n; row++){

            for(int csp=1; csp<=Space; csp++){
                System.out.print("\t");
            }
            for(int cst=1; cst<=Star; cst++){
                System.out.print("*\t");
            }

            Space--;
            Star++;

            System.out.println();
        }
    }
}