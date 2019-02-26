public class ChangeXY {
    public String changeXY(String str) {
        String res = "";
        if (str.length() == 0) {
            return res;
        }
        if (str.charAt(0) == 'x') {
            res += 'y';
            return res + changeXY(str.substring(1));
        }
        res += str.charAt(0);
        return res + changeXY(str.substring(1));
    }
}
