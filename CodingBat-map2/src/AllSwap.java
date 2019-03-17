import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                // swap
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;
                // delete
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }
    public static void main(String[]args){
        AllSwap allSwap=new AllSwap();
        String[]str={"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        for(String s:allSwap.allSwap(str)){
            System.out.print(s+" ");
        }
    }
}
