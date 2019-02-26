import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GirlsGoneWild {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int numberOfShirts = Integer.parseInt(rd.readLine());
        String lettersUsedForSkirts = rd.readLine();
        int numberOfGirls = Integer.parseInt(rd.readLine());
        List<String> lettersUsedForSk = new ArrayList<>();
        for (int i = 0; i < lettersUsedForSkirts.length(); i++) {
            lettersUsedForSk.add(lettersUsedForSkirts.charAt(i) + "");
        }
        Set<String> finalResult = new TreeSet<>();
        GirlsGoneWild ggw = new GirlsGoneWild();
        ggw.generatePossibleCombination(0, numberOfShirts, lettersUsedForSk, numberOfGirls, finalResult, new ArrayList<>());
        System.out.println(finalResult.size());
        for (String i : finalResult) {
            System.out.println(i);
        }
    }

    private void generatePossibleCombination(int start, int shirts, List<String> skirts, int girls, Set<String> finalResult, List<String> current) {
        if (current.size() == girls) {
            finalResult.add(String.join("-", current));
        }
        for (int i = start; i < shirts; i++) {
            for (int j = 0; j < skirts.size(); j++) {
                current.add(i + skirts.get(j));
                List<String> remainingSkirts = new ArrayList<>(skirts);
                remainingSkirts.remove(j);
                generatePossibleCombination(i + 1, shirts, remainingSkirts, girls, finalResult, current);
                current.remove(i + skirts.get(j));
            }
        }
    }
}

