import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaperCutter {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        for (int i = 10; i >= 0; i--) {
            if(n<Math.pow(2,i)){
                System.out.println("A"+(10-i));
            }else{
                n-=Math.pow(2,i);
            }
        }
    }
}
