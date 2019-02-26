import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeastMajorityMultiple {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        byte a = Byte.parseByte(rd.readLine());
        byte b = Byte.parseByte(rd.readLine());
        byte c = Byte.parseByte(rd.readLine());
        byte d = Byte.parseByte(rd.readLine());
        byte e = Byte.parseByte(rd.readLine());
        int count=0;
        int number=0;
        for (int i = 4; i < 96*97*98; i++) {
            if(i%a==0){
                count++;
            }if (i%b==0){
                count++;
            }if(i%c==0){
                count++;
            }if(i%d==0){
                count++;
            }if(i%e==0){
                count++;
            }if(count>=3){
                number=i;
                break;
            }else{
                count=0;
            }
        }
        System.out.println(number);
    }
}
