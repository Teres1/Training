import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigNumbers {
    private int left, maxLen;
    public static  void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine().replaceAll(" ",""));
        String []input=rd.readLine().split(" ");
        String str="";
        for (int i = 0; i < input.length; i++) {
            str+=input[i];
        }
        BigNumbers bigNumbers=new BigNumbers();
        System.out.println(bigNumbers.longestPalindrome(str));
    }


    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }
        String res="";
        res=s.substring(left, left + maxLen);
        while(res.charAt(0)=='0'){
            res=res.substring(1,res.length()-1);
        }
        return  res.replace("0*$", "");
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            left = j + 1;
            maxLen = k - j - 1;
        }
    }
}
