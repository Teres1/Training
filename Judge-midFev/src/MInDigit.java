import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MInDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String input=rd.readLine();
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < input.length(); i++) {
            if(Integer.parseInt(input.charAt(i)+"")<min
                    &&Integer.parseInt(input.charAt(i)+"")!=0){
                min=Integer.parseInt(input.charAt(i)+"");
            }
        }
        System.out.println(min);
    }
}
