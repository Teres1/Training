import java.util.ArrayList;
import java.util.List;

public class WithoutString {
    public String withoutString(String base, String remove) {
        String res = "";
        for (int i = 0; i < base.length(); i++) {
            if (i <= base.length() - remove.length()) {
                if (!base.toLowerCase().substring(i, i + remove.length())
                        .equals(remove.toLowerCase())) {
                    res += base.substring(i, i + 1);
                } else {
                    i += remove.length() - 1;
                }
            } else {
                if (!base.toLowerCase().substring(i, i + 1).equals(remove.toLowerCase()))
                    res += base.substring(i, i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String base = "Hi HoHo";
        String remove = "Ho";
        WithoutString withoutString = new WithoutString();
        System.out.println(withoutString.withoutString(base, remove));
    }
}
