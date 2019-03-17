import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s : strings) {
            if(map.get(s.charAt(0)+"")==null){
                map.put(s.charAt(0)+"",s);
            }else {
                map.put(s.charAt(0) + "", map.get(s.charAt(0) + "") + s);
            }
        }
        return map;
    }
    public static void main(String[]args){
        FirstChar firstChar=new FirstChar();
        String[]str={"salt", "tea", "soda", "toast"};
        System.out.println(firstChar.firstChar(str));
    }
}
