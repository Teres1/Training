import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class AboveTheMainDiagonal {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        BigInteger[][]matrix=new BigInteger[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=BigInteger.valueOf(2).pow(i+j);
            }

        }
        BigInteger sum=BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i<=j){
                    sum=sum.add(BigInteger.valueOf(2).pow(i+j));
                }
            }

        }
        System.out.println(sum);
    }
}
