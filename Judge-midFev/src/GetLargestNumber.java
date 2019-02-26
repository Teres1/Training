import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetLargestNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String []input=rd.readLine().split(" ");
        int firstNumber = Integer.parseInt(input[0]);
        int secondNumber=Integer.parseInt(input[1]);
        int thirdNumber=Integer.parseInt(input[2]);
        GetLargestNumber getLargestNumber=new GetLargestNumber();
        System.out.println(getLargestNumber.getMax(firstNumber
                ,getLargestNumber.getMax(secondNumber,thirdNumber)));
    }
    private int getMax(int number1,int number2){
        if(number1>number2){
            return number1;
        }
        return number2;
    }
}
