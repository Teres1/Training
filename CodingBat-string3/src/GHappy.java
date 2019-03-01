public class GHappy {
    public boolean gHappy(String str) {
        boolean res = true;
        if (str.length() == 0) {
            return true;
        } else if (str.length() == 1) {
            return false;
        } else {
            if (str.charAt(0) == 'g') {
                if (str.charAt(1) == 'g') {
                    return true;
                }
                return false;
            }
            if (str.charAt(str.length() - 1) == 'g') {
                if (str.charAt(str.length() - 2) == 'g') {
                    return true;
                }
                return false;
            }
            for (int i = 1; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'g') {
                    if ((str.charAt(i + 1) == 'g' || str.charAt(i - 1) == 'g') && res == true) {
                        res = true;
                    } else {
                        res = false;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "xxgggxyg";
        GHappy gHappy = new GHappy();
        System.out.println(gHappy.gHappy(str));
    }
}
