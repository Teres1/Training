import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beach {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = rd.readLine().trim().split(" ");
        int LoniGoHour = Integer.parseInt(firstLine[0]);
        int LoniGoMinutes = Integer.parseInt(firstLine[1]);
        int LoniLeaveHour = Integer.parseInt(firstLine[2]);
        int LoniLeaveMinutes = Integer.parseInt(firstLine[3]);
        int MoniGoHour = Integer.parseInt(firstLine[4]);
        int MoniGoMinutes = Integer.parseInt(firstLine[5]);
        int MoniLeaveHour = Integer.parseInt(firstLine[6]);
        int MoniLeaveMinutes = Integer.parseInt(firstLine[7]);
        int max=Math.max(LoniGoHour*60+LoniGoMinutes,MoniGoHour*60+MoniGoMinutes);
        int min=Math.min(LoniLeaveHour*60+LoniLeaveMinutes,MoniLeaveHour*60+MoniLeaveMinutes);
        if (max>min) {
            System.out.println("No");
        }else{
            if (LoniGoHour == MoniGoHour) {
                System.out.print(LoniGoHour + " " + Math.max(LoniGoMinutes, MoniGoMinutes) + " ");
                if (LoniLeaveHour < MoniLeaveHour) {
                    System.out.print(LoniLeaveHour + " " + LoniLeaveMinutes);
                } else if (LoniLeaveHour > MoniLeaveHour) {
                    System.out.print(MoniLeaveHour + " " + MoniLeaveMinutes);
                } else {
                    System.out.print(MoniLeaveHour + " " + Math.min(MoniLeaveMinutes, LoniLeaveMinutes));
                }
            } else if (LoniGoHour < MoniGoHour) {
                System.out.print(MoniGoHour + " " + MoniGoMinutes+" ");
                if (LoniLeaveHour < MoniLeaveHour) {
                    System.out.print(LoniLeaveHour + " " + LoniLeaveMinutes);
                } else if (LoniLeaveHour > MoniLeaveHour) {
                    System.out.print(MoniLeaveHour + " " + MoniLeaveMinutes);
                } else {
                    System.out.print(MoniLeaveHour + " " + Math.min(MoniLeaveMinutes, LoniLeaveMinutes));
                }
            } else {

                System.out.print(LoniGoHour + " " + LoniGoMinutes+" ");
                if (LoniLeaveHour < MoniLeaveHour) {
                    System.out.print(LoniLeaveHour + " " + LoniLeaveMinutes);
                } else if (LoniLeaveHour > MoniLeaveHour) {
                    System.out.print(MoniLeaveHour + " " + MoniLeaveMinutes);
                } else {
                    System.out.print(MoniLeaveHour + " " + Math.min(MoniLeaveMinutes, LoniLeaveMinutes));
                }
            }
        }


    }
}

