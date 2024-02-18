import java.util.Scanner;

public class diffsumproduct {
    // public static void staticsum(int n){
    //     int sum = 0;
    //     while(n>0){
    //         sum = sum + n%10;
    //         n = n/10;   
    //     }
    //     System.out.println(sum);
    // }
    // public static void getProduct(int n){
    //     int product = 1; 
  
    //     while (n != 0) { 
    //         product = product * (n % 10); 
    //         n = n / 10; 
    //     } 
  
    //      System.out.println(product);
    // }
    public static void getdiifproductsum(int n){
        int sum = 0;
        int product = 1;
        while(n != 0){
            sum = sum + (n%10);
            product = product * (n % 10);
            n = n / 10;
        }
        System.out.println(product-sum);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // staticsum(n);
        // getProduct(n);
        getdiifproductsum(n);
    }
}
