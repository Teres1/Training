public class CountTriple {
    public int countTriple(String str) {
        int count1 = 0;
        int count2 = 0;
        if (str.length() < 3) {
            return count2;
        } else for (int i = 0; i < str.length() - 2; i++) {
            for (int j = i; j < i + 3; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count1++;
                }
            }
            if (count1 == 3) {
                count2++;
            }
            count1 = 0;
        }
        return count2;
    }

    public static void main(String[] args) {
        String str = "222abyyycdXXX";
        CountTriple countTriple = new CountTriple();
        System.out.println(countTriple.countTriple(str));
    }

}
