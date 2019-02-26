import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParenBit {
    public String parenBit(String str) {
        if(str.equals("")){
            return "";
        }
        if(str.charAt(0)=='('){
            if(str.charAt(str.length()-1)==')') {
                return str;
            }
            return parenBit(str.substring(0,str.length()-1));

        }
        return parenBit(str.substring(1));
    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        String str=rd.readLine();
        ParenBit parenBit=new ParenBit();
        System.out.println(parenBit.parenBit(str));
    }
}
