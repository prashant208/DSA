import java.util.Scanner;

public class patternsix {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int Star = n/2 + 1;
        int Space = 1;

        for(int row=1; row<=n; row++){

            for(int cst=1; cst<=Star; cst++){
                System.out.print("*\t");
            }

            for(int csp=1; csp<=Space; csp++){
                System.out.print("\t");
            }

            for(int cst=1; cst<=Star; cst++){
                System.out.print("*\t");
            }

            if(row<=n/2){
                Space = Space + 2 ;
                Star = Star -1;
            }else{
                Space = Space - 2;
                Star = Star + 1;
            }

            System.out.println();
        }
         
    }
}
