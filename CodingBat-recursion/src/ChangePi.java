public class ChangePi {
    public String changePi(String str) {
        String res = "";
        if (str.length() == 0) {
            return res;
        }
        if (str.length() > 1) {
            if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
                res += "3.14";
                return res + changePi(str.substring(2));
            }
        }
        return str.charAt(0) + changePi(str.substring(1));
    }
}
