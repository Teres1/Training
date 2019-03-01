public class EqualIsNot {
    public boolean equalIsNot(String str) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                count1++;
            }
        }
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("not")) {
                count2++;
            }
        }
        if (count1 == count2) {
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        String str="isisnotnot";
        EqualIsNot equalIsNot=new EqualIsNot();
        System.out.println(equalIsNot.equalIsNot(str));
    }
}
