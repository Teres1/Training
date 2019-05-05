import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prize {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] input = rd.readLine().trim().split(" ");
        String res1="";
        String res2="";
        for (int i = 0; i < input.length; i++) {
            if(input[i].equals("2")){
                res1="No";
            }else{
                if(input[i].equals("6")){
                    res2+="*";
                }
            }
        }
        if(!res1.equals("")){
            System.out.println(res1);
        }else{
            if(res2.equals("")){
                System.out.println("No");
            }else {
                System.out.println(res2);
            }
        }
    }
}
