import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = rd.readLine().split(" ");
        int firstArrayLength = Integer.parseInt(line1[0]);
        int secondArrayLength = Integer.parseInt(line1[1]);
        int[] arr1 = new int[10000];
        int[] arr2 = new int[10000];
        String []line2=rd.readLine().split(" ");
        String[]line3=rd.readLine().split(" ");
        for (int i = 0; i < firstArrayLength; i++) {
            arr1[i]=Integer.parseInt(line2[i]);
        }
        for (int i = 0; i < secondArrayLength; i++) {
            arr2[i]=Integer.parseInt(line3[i]);
        }
        int []resArr=new int[10001];
        resArr[0]=(arr1[0]+arr2[0])%10;
        for (int i = 1; i <10000 ; i++) {
            if(arr1[i-1]+arr2[i-1]>=10) {
                resArr[i] = (arr1[i] + arr2[i] + 1) % 10;
            }else{
                resArr[i]=(arr1[i]+arr2[i])%10;
            }
        }
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < Math.max(firstArrayLength,secondArrayLength)+1; i++) {
            res.append(resArr[i]);
        }
        if(res.charAt(res.length()-1)=='0'){
            res.deleteCharAt(res.length()-1);
        }
        String res2=res.toString();
        for (int i = 0; i < res2.length(); i++) {
            System.out.print(res2.charAt(i)+" ");
        }
    }
}
