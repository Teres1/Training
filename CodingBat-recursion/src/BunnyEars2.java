import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BunnyEars2 {
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies == 1) {
            return 2;
        }
        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        } else {
            return 2 + bunnyEars2(bunnies - 1);
        }
    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine());
        BunnyEars2 be=new BunnyEars2();
        System.out.println(be.bunnyEars2(n));
    }
}
