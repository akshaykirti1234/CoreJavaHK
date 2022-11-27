import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BankAccount{
    private static String bankName;
    private static String branchName;
    private static String ifsc;

    private long accNum;
    private String accHName;
    private double balance;

    static{
        out.println("\nBank account class is loaded");
        try{Thread.sleep(1000);}
        catch(InterruptedException e){}

        out.println("SV memory allocated with default values");
        try{Thread.sleep(1000)}
        catch(InterruptedException e){}

        out.println("Reading static variable from file and initializing them");
        try{Thread.sleep(1000);}
        catch(InterruptedException e){}

        try{
            // Connecting to file
            BufferedReader FileReader = new BufferedReader(new FileReader("bankdetails.txt"));

            // Reading values file and storing in static variable

            bankName = FileReader.readLine();
            branchName = FileReader.readLine();
            ifsc = FileReader.readLine();

            out.println("SV are initialized with file value \n");
            try{Thread.sleep(1000);}
            catch(InterruptedException e){}
        }catch(FileNotFoundException e){
            out.println("Error: bankdetails.txt file is not found");
        }catch(IOException e){
            e.printStackTrace();
        }
        try{Thread.sleep(1000);}
        catch(InterruptedException e){}
    }// static block end

    { //static block
        out.println("NOn static vsriale allocated with default values");
        try{Thread.sleep(1000);}
        catch(InterruptedException e){}

        out.println("Reading accnum from values from file and initializing it");
        try{Thread.sleep(1000);}
        catch(InterruptedException e){}

    }
}