import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerN {
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int base=Integer.parseInt(rd.readLine());
        int n=Integer.parseInt(rd.readLine());
        PowerN powerN=new PowerN();
        System.out.println(powerN.powerN(base,n));
    }
    public int powerN(int base, int n) {
        if(n==1){
            return base;
        }
        return base*powerN(base,n-1);
    }
}
