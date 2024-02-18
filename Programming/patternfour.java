import java.util.Scanner;

public class patternfour {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int Star = 1;
        int Space = n/2;

        for(int row=1; row<=n; row++){

            for(int csp=1; csp<=Space; csp++){
                System.out.print("\t");
            }
            for(int cst=1; cst<=Star; cst++){
                System.out.print("*\t");
            }

            if(row<=n/2){
                Space = Space - 1;
                Star = Star + 2;
            }else{
                Space = Space + 1;
                Star = Star - 2;
            }

            System.out.println();
        }
         
    }
}
