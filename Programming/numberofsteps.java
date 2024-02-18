import java.util.Scanner;

public class numberofsteps {

    public static void numofsteps(int n){
        int count = 0;
        while(n>0){
            int rem = n/2;
            if(rem%2 != 0){
                rem = rem - 1;
                count++;
            }
        }
        System.out.println(count);
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        numofsteps(n);
    }
}
