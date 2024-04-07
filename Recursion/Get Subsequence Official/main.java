import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<String> ans = gss(s);
        System.err.println(ans);
    }

    public static ArrayList<String> gss(String str){
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> recAns = gss(ros);
        ArrayList<String> myAns = new ArrayList<>();

        for(String x : recAns){
            recAns.add(x);
        }

        for(String x : recAns){
            recAns.add(ch + x);
        }

        return recAns;
    }
}
