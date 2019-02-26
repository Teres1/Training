import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Quadronacci {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        long q1 = Long.parseLong(rd.readLine());
        long q2 = Long.parseLong(rd.readLine());
        long q3 = Long.parseLong(rd.readLine());
        long q4 = Long.parseLong(rd.readLine());
        long qN = 0;
        byte r = Byte.parseByte(rd.readLine());
        byte c = Byte.parseByte(rd.readLine());
        List<Long> list = new ArrayList<>();
        list.add(q1);
        list.add(q2);
        list.add(q3);
        list.add(q4);
        for (int i = 4; i < r * c; i++) {
            qN = q1 + q2 + q3 + q4;
            q1 = q2;
            q2 = q3;
            q3 = q4;
            q4 = qN;
            list.add(qN);
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(list.get(j+i*c)+" ");

            }
            System.out.println();
            }

        }

    }

