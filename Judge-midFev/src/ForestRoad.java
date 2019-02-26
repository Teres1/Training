import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForestRoad {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        for (int i = n; i < 2*n-1; i++) {
            for (int j = 0; j < n; j++) {
                if(2*n-i-2==j){
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
