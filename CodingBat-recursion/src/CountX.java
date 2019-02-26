import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountX {
    public int countX(String str) {
        if(str.length()==0){
            return 0;
        }if(str.charAt(0)=='x'){
            return 1+countX(str.substring(1));
        }
        return countX(str.substring(1));
    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        String str =rd.readLine();
        CountX countX=new CountX();
        System.out.println(countX.countX(str));
    }
}
