import java.io.IOException;
import java.io.DataInputStream;

public class Addition{
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Fno : ");
        int a = Integer.parseInt(dis.readLine());
        System.out.print("Enter SNo :");
        int b = Integer.parseInt(dis.readLine());
        int c = a+b;

        System.out.println("Addition : "+c);
    }
}