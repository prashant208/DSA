import java.util.Scanner;

public class main {
    public static String toggleCase(String s){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                // Upper to Lower
                char t = (char)(ch - 'A' + 'a');
                sb.append(t);
            }else{
                // Lower to Upper
                char t = (char)(ch - 'a' + 'A');
                sb.append(t);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(toggleCase(s));
    }
}
