import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class MaxEven {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String input = rd.readLine();
        StringBuilder res = new StringBuilder();
        if (Character.isDigit(input.charAt(0))) {
            res.append(input.charAt(0));
        }
        for (int i = 1; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i)) || Character.isDigit(input.charAt(i - 1)) && input.charAt(i) == ' ') {
                res.append(input.charAt(i));
            }
        }
        if (res.length()==0) {
            System.out.println(-1);
        }else{
            String[] num = res.toString().split(" ");
            int[] arr = new int[num.length];
            for (int i = 0; i < num.length; i++) {
                arr[i] = Integer.parseInt(num[i]);
            }
            int maxEvenNumber = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    maxEvenNumber = Math.max(maxEvenNumber, arr[i]);
                }
            }
            if (maxEvenNumber == 0) {
                System.out.println(-1);
            } else {
                System.out.println(maxEvenNumber);
            }
        }
    }
}
