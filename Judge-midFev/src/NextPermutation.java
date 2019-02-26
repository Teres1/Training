import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        String[] input = rd.readLine().split(" ");
        List<Long> inputList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputList.add(Long.parseLong(input[i]));
        }
        int changeIndex = 0;
        int nextOfChangeIndex = 0;
        for (int i = 1; i < n; i++) {
            if (inputList.get(i - 1) < inputList.get(i)) {
                changeIndex = i - 1;
            }
        }
        for (int i = changeIndex; i < n; i++) {
            if (inputList.get(changeIndex) < inputList.get(i)) {
                nextOfChangeIndex = i;
            }
        }
        Collections.swap(inputList, changeIndex, nextOfChangeIndex);
        List<Long> outputList = new ArrayList<>();
        for (int i = 0; i <= changeIndex; i++) {
            outputList.add(inputList.get(i));
        }
        List<Long> reverseList = new ArrayList<>();
        for (int i = changeIndex + 1; i < n; i++) {
            reverseList.add(inputList.get(i));
        }
        Collections.sort(reverseList);
        for (int i = changeIndex+1; i < n; i++) {
            outputList.add(reverseList.get(i-changeIndex-1));
        }
        for (int i = 0; i < n; i++) {
            System.out.print(outputList.get(i)+" ");
        }


    }
}
