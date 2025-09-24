import java.util.*;
import java.util.regex.*;
public class numberValidation {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String str=sc.nextLine();

        Pattern pt=Pattern.compile("^\\+?91 [6-9]{1}[0-9]{9}$");
        Matcher mt=pt.matcher(str);

        String ans=mt.matches()?"vallid":"Invalid";
        System.out.println(ans);

    }
}
