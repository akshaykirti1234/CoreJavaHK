import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Addition{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Fno: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter SNo: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Addition : "+ (a+b) );
    }
}