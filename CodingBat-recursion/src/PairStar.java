public class PairStar {
    public String pairStar(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str.charAt(0) + "";
        }
        if (str.length() > 1) {
            if (str.charAt(0) == str.charAt(1)) {
                return str.charAt(0) + "*" + pairStar(str.substring(1));
            }
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }
}
