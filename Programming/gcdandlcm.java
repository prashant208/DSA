package DSA.Programming;
import java.util.Scanner;

public class gcdandlcm {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int oN1 = n1;
        int oN2 = n2;

        while(n1%n2 != 0){
            int rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;

        int lcm = (oN1 * oN2)/gcd;

        System.out.println(lcm);
    }
}
