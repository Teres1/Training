import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String,Integer> map=new HashMap();
        for(String s:strings){
            if(map.get(s)==null){
                map.put(s,0);
            }
            map.put(s,map.get(s)+1);
        }
        return map;
    }
}
