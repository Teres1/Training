import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mutating {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine().trim());
        String[] input = rd.readLine().split(" ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Mutating mt = new Mutating();
        int newArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i]=Integer.parseInt(mt.mutating(input[i]));
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            if(mt.gcd(arr[i],newArr[i])<10){
                count++;
            }
        }
        System.out.println(count);

    }

    private String mutating(String num) {
        String res = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                res += 9;
            } else if (num.charAt(i) == '9') {
                res += 0;
            } else if (Integer.parseInt(num.charAt(i) + "") % 2 == 0) {
                res += (Integer.parseInt(num.charAt(i) + "") - 1);

            } else {
                res += (Integer.parseInt(num.charAt(i) + "") + 1);
            }
        }
        return res;
    }
    private int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }
}
