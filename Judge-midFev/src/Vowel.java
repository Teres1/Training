import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vowel {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String input = rd.readLine();
        int count=0;
        int vowelCount=0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='a'||input.charAt(i)=='o'||input.charAt(i)=='u'
                    ||input.charAt(i)=='e'||input.charAt(i)=='y'||
                    input.charAt(i)=='i'){
                vowelCount++;
            }else{
                count++;
            }
        }
        if(count==vowelCount){
            System.out.println("Yes");
        }else{
            System.out.println(vowelCount+" "+count);
        }
    }
}
