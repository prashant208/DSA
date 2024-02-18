import java.util.Scanner;

public class patternelevn {
        public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int Space = n/2;
        int Star = 1;
        for(int row=1; row<=n; row++){
            for(int csp=1; csp<=Space; csp++){
                System.out.print("\t");
            }
            for(int cst=1; cst<=Star; cst++){
                System.out.print("*\t");
            }

            if(row<=n/2){
                Space = Space - 1;
                Star = Star + 1;
            }else{
                Space = Space + 1;
                Star = Star - 1;
            }

            System.out.println();

        }
    }
}
