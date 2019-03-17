import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Figure {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = rd.readLine().trim().split(" ");
        int a = Integer.parseInt(firstLine[0]);
        int b = Integer.parseInt(firstLine[1]);
        int c = Integer.parseInt(firstLine[2]);
        int d = Integer.parseInt(firstLine[3]);
        int h = Integer.parseInt(firstLine[4]);
        int maxRectangleSide = Math.max(d, h);
        int p = 0;
        if (a >= b && a >= c) {
            p = b + c + Math.abs(a - maxRectangleSide) + 2 * Math.min(d, h) + maxRectangleSide;
        }
        if (a >= c && a > b) {
            p = b + c + Math.abs(a - maxRectangleSide) + 2 * Math.min(d, h) + maxRectangleSide;
        }
        if (a > b && a >= c) {
            p = b + c + Math.abs(a - maxRectangleSide) + 2 * Math.min(d, h) + maxRectangleSide;
        }
        if (b >= c && b >= a) {
            p = a + c + Math.abs(b - maxRectangleSide) + 2 * Math.min(d, h) + maxRectangleSide;
        }
        if (b > c && b >= a) {
            p = a + c + Math.abs(b - maxRectangleSide) + 2 * Math.min(d, h) + maxRectangleSide;
        }
        if (b >= c && b > a) {
            p = a + c + Math.abs(b - maxRectangleSide) + 2 * Math.min(d, h) + maxRectangleSide;
        }
        if (c >= a && c >= b) {
            p = a + b + Math.abs(c - maxRectangleSide) + 2 * Math.min(d, h) + maxRectangleSide;
        }
        if (c > a && c >= b) {
            p = a + b + Math.abs(c - maxRectangleSide) + 2 * Math.min(d, h) + maxRectangleSide;
        }
        if (c >= a && c > b) {
            p = a + b + Math.abs(c - maxRectangleSide) + 2 * Math.min(d, h) + maxRectangleSide;
        }
        System.out.println(p);
    }

}
