import java.util.Scanner;

public class powerlogarithmic {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int recAns = power(x, n/2);
        recAns = recAns * recAns;

        if(n%2 != 0){
            recAns = recAns * x;
        }
        return recAns;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
    }
}
