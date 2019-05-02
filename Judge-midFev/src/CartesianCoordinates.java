import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CartesianCoordinates {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(rd.readLine());
        double y = Double.parseDouble(rd.readLine());
        if(x==0&&y==0){
            System.out.println(0);
        }
        else if(x>0&&y>0){
            System.out.println(1);
        }else if(x<0&&y>0){
            System.out.println(2);
        }else if(x<0&&y<0){
            System.out.println(3);
        }else if(x>0&&y<0){
            System.out.println(4);
        }else if(x==0){
            System.out.println(5);
        }else{
            System.out.println(6);
        }
    }
}
