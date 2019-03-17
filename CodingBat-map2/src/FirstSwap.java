import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].charAt(0) + "")
                    &&map.get(strings[i].charAt(0)+"")==1) {
                int pos = map.get(strings[i].charAt(0) + "");
                String temp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = temp;
                map.put(strings[i].charAt(0)+"",map.get(strings[i].charAt(0)+1));
                map.remove(strings[i].charAt(0) + "");
            } else {
                map.put(strings[i].charAt(0) + "", 1);
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        FirstSwap firstSwap = new FirstSwap();
        String[] str = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        for (String s : firstSwap.firstSwap(str)) {
            System.out.print(s + " ");
        }


    }
}
