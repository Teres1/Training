import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MergingAndSquashing {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(rd.readLine());
            list.add(num);
        }
        StringBuilder res1=new StringBuilder();
        StringBuilder res2=new StringBuilder();
        MergingAndSquashing mg1=new MergingAndSquashing();
        for (int i = 1; i < list.size(); i++) {
            res1.append(mg1.merging(list.get(i-1),list.get(i))+" ");

            res2.append(mg1.squashing(list.get(i-1),list.get(i))+" ");
        }
        System.out.println(res1.toString());
        System.out.println(res2.toString());
    }
        private String merging(int num1,int num2){
            String resultOfMerging="";
            resultOfMerging+=num1%10;
            resultOfMerging+=num2/10;
            return resultOfMerging;
        }
        private String squashing(int num1,int num2){
        String resultOfSquashing="";
        resultOfSquashing+=num1/10;
        resultOfSquashing+=(num1%10+num2/10)%10;
        resultOfSquashing+=num2%10;
        return resultOfSquashing;
        }

    }

