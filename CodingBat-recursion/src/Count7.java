import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count7 {
    public int count7(int n) {
        if(n==7){
            return 1;
        }if(n<9&&n!=7){
            return 0;
        }
        if(n%10==7){
            return 1+count7(n/10);
        }

        return count7(n/10);
    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine());
        Count7 count7=new Count7();
        System.out.println(count7.count7(n));
    }
}
