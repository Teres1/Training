import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String,Boolean>map=new HashMap();
        Map<String,Integer>map1=new HashMap();
        for(int i=0;i<strings.length;i++){
            if(map1.get(strings[i])==null){
                map1.put(strings[i],1);
            }else{
                map1.put(strings[i],map1.get(strings[i])+1);
            }
        }
        for(int i=0;i<strings.length;i++){
            if(map1.get(strings[i])>=2){
                map.put(strings[i],true);
            }
            else{
                map.put(strings[i],false);
            }
        }
        return map;
    }

}
