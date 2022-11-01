/* read username and password from console. we must hide password from console */

import java.io.Console;

public class LoginValidator{
    public static void main(String[] args){
        Console cns = System.console();

        System.out.print("Enter UserName : ");
        String uName = cns.readLine();

        System.out.print("Enter Password : ");
        char[] pass = cns.readPassword();

        //Diaplaying results
        System.out.println("\nYou enterd");
        System.out.println("Username: "+uName);
        System.out.println("password :"+new String(pass));
    }
}