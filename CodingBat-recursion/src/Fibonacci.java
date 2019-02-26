import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public int fibonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1||n==2){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine());
        Fibonacci fib=new Fibonacci();
        System.out.println(fib.fibonacci(n));
    }
}
