import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BunnyEars {
    public int bunnyEars(int bunnies) {
        if(bunnies==0){
            return 0;
        }else{
            return 2+bunnyEars(bunnies-1);
        }
    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine());
        BunnyEars be=new BunnyEars();
        System.out.println(be.bunnyEars(n));
    }
}
