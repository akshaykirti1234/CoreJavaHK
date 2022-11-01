class Bank{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();//creating instance of Bank class for HK object
        BankAccount acc2 = new BankAccount();//creating instance of Bank class for BK object

        BankAccount.bankName="HDFC";
        BankAccount.branchName="Ameerpet";
        BankAccount.ifsc="HD123AM";

        //initializing values for object HK
        acc1.accNum = 123456789101L;
        acc1.accHName = "HK";
        acc1.balance = 999999;
        acc1.address = new Address(); //Creating instance of Address class for HK object
        // initializing HK object values in Address instance
        acc1.address.aptName="HKHeaven";
        acc1.address.StrName="1";
        acc1.address.city="Hydrabad";
        acc1.address.pin = 500016;

        //initalizing values for object BK
        acc2.accNum = 325647895102L;
        acc2.accHName = "BK";
        acc2.balance = 9864789;
        acc2.address = new Address(); // creating instance of Address class for BK object
        //initializing Bk object values in Address instance
        acc2.address.aptName = "BkHeaven";
        acc2.address.StrName = "2";
        acc2.address.city = "Sec";
        acc2.address.pin = 500017;

        //Displaying HK object values
        System.out.println("====== HK object Values =====");
        System.out.println("Bank Name :"+acc1.bankName);
        System.out.println("Branch :"+acc1.branchName);
        System.out.println("ifsc :"+acc1.ifsc);
        System.out.println("Account no :"+acc1.accNum);
        System.out.println("ACHolder Name :"+acc1.accHName);
        System.out.println("Balance :"+acc1.balance);
        System.out.println("******** Addres *******");
        System.out.println("Apartment Name :"+acc1.address.aptName);
        System.out.println("streetName :"+acc1.address.StrName);
        System.out.println("City:"+acc1.address.city);
        System.out.println("PinCode:"+acc1.address.pin);

        //Displaying BK object values
        System.out.println("====== BK object Values =====");
        System.out.println("Bank Name :"+acc2.bankName);
        System.out.println("Branch :"+acc2.branchName);
        System.out.println("ifsc :"+acc2.ifsc);
        System.out.println("Account no :"+acc2.accNum);
        System.out.println("ACHolder Name :"+acc2.accHName);
        System.out.println("Balance :"+acc2.balance);
        System.out.println("******** Addres *******");
        System.out.println("Apartment Name :"+acc2.address.aptName);
        System.out.println("streetName :"+acc2.address.StrName);
        System.out.println("City:"+acc2.address.city);
        System.out.println("PinCode:"+acc2.address.pin);
    }
}