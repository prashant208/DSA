import java.util.Scanner;
public class DataType {
    public static int dataTypes(String type) {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        if(str == "Long"){
            return 8;
        }
        else if(str == "Integer"){
            return 4;
        }
        else if(str == "Float"){
            return 4;
        }
        else if(str == "Double"){
            return 8;
        }
        else if(str == "Character"){
            return 8;
        }
        return 0;

    }
}