import java.util.Scanner;

public class patterntwlve {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==i || j==6-i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
