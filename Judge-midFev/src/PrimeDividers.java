import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeDividers {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = rd.readLine().trim().split(" ");
        int firstNumber = Integer.parseInt(firstLine[0]);
        int secondNumber = Integer.parseInt(firstLine[1]);
        PrimeDividers pm=new PrimeDividers();
        System.out.println(pm.primeDiv(firstNumber,secondNumber));

    }
    private String primeDiv(int num1,int num2){
        String res="";
        int min=Math.min(num1,num2);
        for (int i = 2; i <=min ; i++) {
            if(num1%i==0&&num2%i==0&&isPrime(i)){
                res+=i+" ";
                min/=i;
            }
        }
        if(!res.equals("")){
            return res;
        }
        return -1+"";
    }
    private static boolean isPrime(int num){
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
