public class BankAccount{

    double balance;
    public static void main(String[] args) {
        BankAccount ob = new BankAccount();
        ob.deposite(5000);
    }

    void deposite(double amt){ //bank account object bussiness operation
        balance = balance+amt;
        System.out.println("Balance :\t"+balance);
    }
}