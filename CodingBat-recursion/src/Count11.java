public class Count11 {
    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.charAt(0) == '1' && str.charAt(1) == '1') {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }
}
