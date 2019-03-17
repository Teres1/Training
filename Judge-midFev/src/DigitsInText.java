import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitsInText {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String line = rd.readLine();
        int sum=0;
        int count=0;
        for (int i = 0; i < line.length(); i++) {
            if(Character.isDigit(line.charAt(i))){
                count++;
                sum+=Integer.parseInt(line.charAt(i)+"");
            }
        }
        if(count==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
        }
    }
}
