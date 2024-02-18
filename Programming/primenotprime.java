import java.util.Scanner;

public class primenotprime {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
