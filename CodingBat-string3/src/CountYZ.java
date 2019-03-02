public class CountYZ {
    public int countYZ(String str) {
        int count = 0;
        if (str.length() == 0) {
            return 0;
        }
        if (str.length() == 1) {
            if (str.charAt(0) == 'y' || str.charAt(0) == 'z'||str.charAt(0)=='Y'
                    ||str.charAt(0)=='Z') {
                return 1;
            } else {
                return 0;
            }
        } else {
            for (int i = 0; i < str.length() - 1; i++) {
                if ((str.charAt(i) == 'y' || str.charAt(i) == 'z'
                ||str.charAt(i)=='Y'||str.charAt(i)=='Z')
                        && !Character.isLetter(str.charAt(i+1)) ) {
                    count++;
                }
            }
            if (str.charAt(str.length() - 1) == 'y'
                    || str.charAt(str.length() - 1) == 'z'
                    ||str.charAt(str.length()-1)=='Y'
                    ||str.charAt(str.length()-1)=='Z') {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str = "day fyyyz";
        CountYZ countYZ = new CountYZ();
        System.out.println(countYZ.countYZ(str));
    }

}
