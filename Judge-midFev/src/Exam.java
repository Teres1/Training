import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] input = rd.readLine().trim().split(" ");
        int n = Integer.parseInt(input[0]);
        int l = Integer.parseInt(input[1]);
        int r = Integer.parseInt(input[2]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int newArr[] = new int[n];
        String[] input1 = rd.readLine().split(" ");
        int[] arr1 = new int[input1.length];
        for (int i = 0; i < input1.length; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }
        String[] input2 = rd.readLine().split(" ");
        int[] arr2 = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < r; j++) {
                if (arr[i] == arr2[j]) {
                    newArr[i] += 2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                if (arr[i] == arr1[j]) {
                    newArr[i] --;
                }
            }
        }
        if (newArr[0] == 2) {
            if (newArr[1] == -1) {
                newArr[0]--;
                newArr[1]++;
            }
        }
        if (newArr[0] == -1) {
            if (newArr[1] == 2) {
                newArr[1]--;
                newArr[0]++;
            }
        }
        for (int i = 1; i < newArr.length-1; i++) {
            if(newArr[i]==2){
                if(newArr[i-1]==-1){
                    newArr[i]--;
                    newArr[i-1]++;
                }else{
                    if(newArr[i+1]==-1){
                        newArr[i]--;
                        newArr[i+1]++;
                    }
                }
            }
        }
        if(newArr[newArr.length-1]==-1){
            if(newArr[newArr.length-2]==2){
                newArr[newArr.length-2]--;
                newArr[newArr.length-1]++;
            }
        }
        if(newArr[newArr.length-1]==2){
            if(newArr[newArr.length-2]==-1){
                newArr[newArr.length-1]--;
                newArr[newArr.length-2]++;
            }
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            if(newArr[i]==-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
