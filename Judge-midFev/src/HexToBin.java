import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexToBin {
    public static void main(String []args)throws IOException{
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        String input=rd.readLine();
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='0'){
                res.append("0000");
            }
            else if(input.charAt(i)=='1'){
                res.append("0001");
            }else if(input.charAt(i)=='2'){
                res.append("0010");
            }else if(input.charAt(i)=='3'){
                res.append("0011");
            }else if(input.charAt(i)=='4'){
                res.append("0100");
            }else if(input.charAt(i)=='5'){
                res.append("0101");
            }else if(input.charAt(i)=='6'){
                res.append("0110");
            }else if(input.charAt(i)=='7'){
                res.append("0111");
            }else if(input.charAt(i)=='8'){
                res.append("1000");
            }else if(input.charAt(i)=='9'){
                res.append("1001");
            }else if(input.charAt(i)=='A'){
                res.append("1010");
            }else if(input.charAt(i)=='B'){
                res.append("1011");
            }else if(input.charAt(i)=='C'){
                res.append("1100");
            }else if(input.charAt(i)=='D'){
                res.append("1101");
            }else if(input.charAt(i)=='E'){
                res.append("1110");
            }else if(input.charAt(i)=='F'){
                res.append("1111");
            }
        }
        if(res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }
        String res1=res.toString();
        if (res1.charAt(0) == '0'&&res1.charAt(1)!='0') {

            res1=res1.substring(1);
        }if(res1.charAt(0)=='0'&&res1.charAt(1)=='0'){
            res1=res1.substring(2);
        }
        System.out.println(res1);
    }
}

