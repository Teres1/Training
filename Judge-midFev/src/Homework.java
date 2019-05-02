import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine());
        int count=0;
        for (int i = n-1; i >=1; i--) {
            count++;
            if(n%i==0){
                break;
            }
        }
        System.out.println(count);
    }
}
