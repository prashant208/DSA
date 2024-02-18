import java.util.Scanner;

public class patternseven {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int Star =  1;
        int Space = 0;
        for(int row=1; row<=n; row++){

            for(int csp=1; csp<=Space; csp++){
                System.out.print("\t");
            }

            System.out.print("*\t");

            System.out.println();

            Space++;
    }
}
}