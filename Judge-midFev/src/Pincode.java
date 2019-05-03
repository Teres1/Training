import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pincode {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] input = rd.readLine().trim().split(" ");
        int arr[] = new int[input.length];
        int max=Integer.MIN_VALUE;
        Pincode pc=new Pincode();
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(pc.reverseStr(input[i]));
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    private String reverseStr(String str){
        String revString="";
        for (int i = str.length()-1; i >=0; i--) {
            revString+=str.charAt(i);
        }
        return revString;
    }
}
