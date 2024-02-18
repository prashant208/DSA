import java.util.Scanner;

public class patternten {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j == n-1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
