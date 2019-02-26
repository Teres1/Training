import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public int triangle(int rows) {
        if (rows == 0) {
            return 0;

        } else {
            return rows + triangle(rows - 1);
        }
    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine());
        Triangle triangle=new Triangle();
        System.out.println(triangle.triangle(n));
    }
}
