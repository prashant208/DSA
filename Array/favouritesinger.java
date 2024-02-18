import java.util.Scanner;
public class favouritesinger {

    public static void numIdenticalpairs(int []arr){
        int count = 0;
        for(int val : arr){
            if(val >count){
                count = val;
            }
        }

        int numFavouriteSingers = 0;
        for(int val : arr){
            if(val == count){
                numFavouriteSingers++;
            }
        }

        System.out.println(numFavouriteSingers);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        numIdenticalpairs(arr);
    }
}
