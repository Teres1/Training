import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class PodobniMasivi {
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine().replaceAll(" ",""));
        String []input=rd.readLine().split(" ");
        TreeSet<Integer>set1=new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(Integer.parseInt(input[i]));
        }
        int m=Integer.parseInt(rd.readLine().replaceAll(" ",""));
        String []input1=rd.readLine().split(" ");
        TreeSet<Integer>set2=new TreeSet<>();
        for (int i = 0; i < m; i++) {
            set2.add(Integer.parseInt(input1[i]));
        }
        int count=0;
        for(Integer i:set1){
            if(set2.contains(i)){
                count++;
            }else{
                count=0;
                break;
            }
        }
        if(count>0){
            System.out.println(count);
        }
        if(count==0){
            for(Integer i:set1){
                if(!set2.contains(i)){
                    System.out.print(i+" ");
                }
            }
        }

    }
}
