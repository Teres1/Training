import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public int factorial(int n) {
        if(n==0||n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[]args)throws IOException{
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine());
        Factorial fact=new Factorial();
        System.out.println(fact.factorial(n));
    }
}
