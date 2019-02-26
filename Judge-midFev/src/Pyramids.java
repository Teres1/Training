import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramids {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(rd.readLine());
        long i=0;
        int j=0;
        while(i<n){
            i+=j;
            j++;
        }
        System.out.println(j-2);
    }
}
