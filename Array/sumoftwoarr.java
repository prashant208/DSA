import java.util.Scanner;

public class sumoftwoarr {

    public static void sumof2arr(int []a, int []b){
        int n1 = a.length;
        int n2 = b.length;
        int size = n1>n2 ? n1 : n2;
        int []c = new int[size];

        int carry = 0;
        int i = n1-1;
        int j = n2-1;
        int k = size - 1;
         while(k >= 0){
            int sum = carry;
            if(i>=0){
                sum = sum + a[i];
            }

            if(j>=0){
                sum = sum + b[j];
            }

            carry = sum/10;
            sum = sum%10;
            c[k] = sum;

            i--;
            j--;
            k--;

            if(carry>0){
                System.out.println(carry);
            }
            for(int val: c){
                System.out.println(val);
            }
         }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n1  = scn.nextInt();
        int []a = new int[n1];
        for(int i=0; i<n1; i++){
            a[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int []b = new int[n2];
        for(int i=0; i<n2; i++){
            b[i] = scn.nextInt();
        }

        sumof2arr(a, b);
    }
}
