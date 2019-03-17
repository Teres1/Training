import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String,String>map=new HashMap();
        for (String s:strings){
            map.put(s.charAt(0)+"",s.charAt(s.length()-1)+"");
        }
        return map;
    }
    public static void main(String[]args)throws IOException{
        Pairs pairs=new Pairs();
        String[]str={"code", "bug"};
        System.out.println(pairs.pairs(str));
    }

}
