import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElMessage {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String message=rd.readLine().replace(".","");
        int count=0;
        int maxCount=0;
        for (int i = 0; i < message.length(); i++) {
            if((message.charAt(i)<'0'||(message.charAt(i)>'9'&&message.charAt(i)<'A')||(message.charAt(i)>'Z'
            &&message.charAt(i)<'a')||message.charAt(i)>'z')&&message.charAt(i)!=' '){
                count++;
            if(maxCount<count) {
                maxCount = count;
            }
            }else{
                count=0;
            }
        }
        System.out.println(maxCount);
    }
}
