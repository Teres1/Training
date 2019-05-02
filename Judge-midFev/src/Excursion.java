import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excursion {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[]input=rd.readLine().trim().split(" ");
        int w=Integer.parseInt(input[0]);
        int h=Integer.parseInt(input[1]);
        int n=Integer.parseInt(rd.readLine().trim());
        boolean noCrash=true;
        int count=1;
        for (int i = 0; i < n; i++) {
            String []input1=rd.readLine().trim().split(" ");
            if(Integer.parseInt(input1[0])>=w&&Integer.parseInt(input1[1])>=h){
                count++;
            }else{
                noCrash=false;
                break;
            }
        }
        if(noCrash){
            System.out.println("No crash");
        }else{
            System.out.println(count);
        }
    }
}
