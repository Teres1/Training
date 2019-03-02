import java.util.ArrayList;
import java.util.List;

public class NotReplace {
    public String notReplace(String str) {
        String res="";
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        if (str.length() == 2 && str.equals("is")) {
            return "is not";
        } else {
            List<Integer> list = new ArrayList<>();
            if (str.substring(0, 2).equals("is") && !Character.isLetter(str.charAt(2))) {
                list.add(0);
            } else {
                for (int i = 1; i < str.length() - 2; i++) {
                    if (str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i + 2)) && !Character.isLetter(str.charAt(i - 1))) {
                        list.add(i);
                    }
                }
            }

            if (str.substring(str.length() - 2, str.length()).equals("is") && !Character.isLetter(str.charAt(str.length() - 3))) {
                list.add(str.length() - 2);
            }
            if (list.size() == 0) {
                return str;
            } else {
                res += str.substring(0, list.get(0));
                for (int j = 0; j < list.size() - 1; j++) {

                    res += str.substring(list.get(j), list.get(j) + 2).replace("is", "is not");
                    res += str.substring(list.get(j) + 2, list.get(j + 1));


                }
                res += str.substring(list.get(list.size() - 1), list.get(list.size() - 1) + 2).replace("is", "is not");
                res += str.substring(list.get(list.size() - 1) + 2);
            }
        }
        return res;
    }

    public static void main(String[]args){
        String str="xis yis";
        NotReplace notReplace =new NotReplace();
        System.out.println(notReplace.notReplace(str));
    }
}
