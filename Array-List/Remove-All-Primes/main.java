import java.util.ArrayList;
import java.util.Scanner;

public class main{
    public static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void solution(ArrayList<Integer> a){
        int n = a.size();
        for(int i=a.size() - 1; i>=0; i--){
            if(isPrime(i)){
                a.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            a.add(scn.nextInt());
        }
        solution(a);
        System.out.println(a);
    }
}