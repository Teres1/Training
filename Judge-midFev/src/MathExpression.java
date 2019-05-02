import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathExpression {
    public static void main(String[]args)throws IOException{
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        double n=Double.parseDouble(rd.readLine());
        double m=Double.parseDouble(rd.readLine());
        double p=Double.parseDouble(rd.readLine());
        double res=(n*n + (1/m/p) + 1337)/(n - 128.523123123*p) + Math.sin((int)m%180);
        System.out.printf("%.6f", res);
    }

}
