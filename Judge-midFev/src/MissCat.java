import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissCat {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine());
        int[] numberOfCats = new int[10];
        int max=0;
        for (int i = 0; i < n; i++) {
            int numberOfCatForWhichIsVoted = Integer.parseInt(rd.readLine());
            numberOfCats[numberOfCatForWhichIsVoted-1]++;
        }
        for (int i = 0; i < numberOfCats.length; i++) {
            if(max<numberOfCats[i]){
                max=numberOfCats[i];
            }
        }
        for (int i = 0; i < numberOfCats.length; i++) {
            if(numberOfCats[i]==max){
                System.out.println(i+1);
                break;
            }
        }
    }
}
