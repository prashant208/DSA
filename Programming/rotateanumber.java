import java.util.Scanner;

public class rotateanumber {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int nod = 0;

        int temp = n;

        while(temp!=0){
            temp = temp/10;
            nod++;
        }

        k = k%nod;
        if(k<0){
            k += nod;
        }

        int pow = (int)Math.pow(10, k);
        int left = n / pow;
        int right = n % pow;

        int mul = (int)Math.pow(10, nod-k);
        
        int answ = right * mul + left;

        System.out.println(answ);
    }
}
