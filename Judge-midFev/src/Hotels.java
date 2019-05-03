import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hotels {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine().trim());
        String []input=rd.readLine().split(" ");
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(input[i]);
        }
        int startCount=1;
        int endCount=1;
        for (int i = 1; i < n; i++) {
            if(arr[i]>arr[i-1]){
                startCount++;
            }
        }
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i+1]<arr[i]){
                endCount++;
            }
        }
        System.out.println(startCount+" "+endCount);
    }
}
