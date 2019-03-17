import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IceCream {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = rd.readLine().trim().split(" ");
        Long numberOfEl=Long.parseLong(firstLine[0]);
        int len=0;
        for (int i = 0; i < firstLine[1].length(); i++) {
            if(firstLine[1].charAt(i)!='0'){
                len++;
            }
        }
        if(len>=numberOfEl){
            System.out.println(0);
        }else{
            System.out.println(numberOfEl-len);
        }
    }
}
