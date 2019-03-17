import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Windows {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = rd.readLine().trim().split(" ");
        int n=Integer.parseInt(firstLine[0]);
        int c=Integer.parseInt(firstLine[1]);
        int []arr=new int[3];
        int sum=0;
        for (int i = 0; i < n; i++) {
            String line[]=rd.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                arr[j]=Integer.parseInt(line[j]);
            }
            if(arr[2]==1){
                sum+=arr[0]*arr[1];
            }
        }
        System.out.println(sum*c);

    }
}
