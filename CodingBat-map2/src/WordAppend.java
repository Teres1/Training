import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public String wordAppend(String[] strings) {
        String res="";Map<String,Integer> map=new HashMap();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.put(strings[i],map.get(strings[i])+1);
                if (map.get(strings[i]) % 2 == 0) {
                    res += strings[i];
                }
            } else {
                map.put(strings[i], 1);
            }

        }
        return res;

    }
    public static void main(String[]args){
        WordAppend wordAppend=new WordAppend();
        String[]str={"a", "b", "a", "c", "a", "d", "a"};
        System.out.println(wordAppend.wordAppend(str));
    }
}
