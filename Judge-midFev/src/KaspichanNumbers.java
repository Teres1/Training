import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class KaspichanNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(rd.readLine());
        BigInteger div;
        BigInteger div2;
        StringBuilder res=new StringBuilder();
        if(n.compareTo(BigInteger.ZERO)==0){
            System.out.println("A");
        }
        while(n.compareTo(BigInteger.valueOf(0))>0){
            div=n.mod(BigInteger.valueOf(256));
            div2=div.divide(BigInteger.valueOf(26));
            if(div2.compareTo(BigInteger.ZERO)==0){
                res.insert(0,(char)(div.intValue()%26+65));
            }  else if(div2.compareTo(BigInteger.ONE)==0){
                res.insert(0,(char)(div.intValue()%26+65));
                res.insert(0,"a");
            } else if(div2.compareTo(BigInteger.valueOf(2))==0){
                res.insert(0,(char)(div.intValue()%26+65));
                res.insert(0,"b");
            }else if(div2.compareTo(BigInteger.valueOf(3))==0) {
                res.insert(0, (char) (div.intValue() % 26 + 65));
                res.insert(0, "c");
            }else if(div2.compareTo(BigInteger.valueOf(4))==0){
                    res.insert(0,(char)(div.intValue()%26+65));
                    res.insert(0,"d");
            }else if(div2.compareTo(BigInteger.valueOf(5))==0){
                res.insert(0,(char)(div.intValue()%26+65));
                res.insert(0,"e");
            }else if(div2.compareTo(BigInteger.valueOf(6))==0){
                res.insert(0,(char)(div.intValue()%26+65));
                res.insert(0,"f");
            }else if(div2.compareTo(BigInteger.valueOf(7))==0){
                res.insert(0,(char)(div.intValue()%26+65));
                res.insert(0,"g");
            }else if(div2.compareTo(BigInteger.valueOf(8))==0){
                res.insert(0,(char)(div.intValue()%26+65));
                res.insert(0,"h");
            }else if(div2.compareTo(BigInteger.valueOf(9))==0){
                res.insert(0,(char)(div.intValue()%26+65));
                res.insert(0,"i");
            }
            n=n.divide(BigInteger.valueOf(256));

        }
        System.out.println(res.toString());
    }
}
