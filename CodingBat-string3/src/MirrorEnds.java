public class MirrorEnds {
    public String mirrorEnds(String string) {
        String res = "";
        if (string.length() == 0) {
            return "";
        }
        if (string.length() == 1) {
            return string;
        } else {
            for (int i = 0, j = string.length() - 1; i < string.length(); i++, j--) {
                if (string.charAt(i) == string.charAt(j)) {
                    res += string.charAt(i);
                } else {
                    return res;
                }
            }
        }
        return res;

    }

}

