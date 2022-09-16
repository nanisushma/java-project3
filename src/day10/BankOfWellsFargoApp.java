package day10;


/**
 * This application is used by Bank of wells fargo
 *
 * @author Sushma Karki
 * @version 1.0.0
 *
 */

public class BankOfWellsFargoApp {

    public static void main(String[] args) {

        BankAccount bishalAccount= new BankAccount();

       // bishalAccount.setAccountNumber();
        bishalAccount.setAccountHolderName ("Bishal Karki");
        bishalAccount.setBankBalance(7000);
        bishalAccount.bankName = "bank of america";
        bishalAccount.setConnectedMobileNumber("9849018753");
        bishalAccount.setAddress("Hawaii Honolulu");
        bishalAccount.setBankAccountType("BankAccountType.String");



       System.out.print(bishalAccount.getAccountNumber());
       System.out.print(bishalAccount.getAccountHolderName());
       System.out.print(bishalAccount.getConnectedMobileNumber());
       System.out.print(bishalAccount.getBankBalance());
       System.out.print(bishalAccount.getAddress());
       System.out.print(bishalAccount.getBankAccountType());






        BankAccount friendAccount= new BankAccount();

        // sushmaAccount.setAccountNumber();
        friendAccount.setAccountHolderName ("Sushma Karki");
        friendAccount.setBankBalance(5000);
        friendAccount.bankName = "bank of america";
        friendAccount.setConnectedMobileNumber("9849018753");
        friendAccount.setAddress("Hawaii Honolulu");
        friendAccount.setBankAccountType("BankAccountType.String");

        // Transfer 2000 from bishal account to friend account

        System.out.print("========Before Transaction=======");

        double bishalFinalBalance = bishalAccount.getBankBalance()- 2000;
        double friendFinalBalance = friendAccount.getBankBalance() + 2000;


        System.out.print("========After Transaction=======");
        bishalAccount.setBankBalance(bishalFinalBalance);
        friendAccount.setBankBalance(friendFinalBalance);


        BankAccount bankAccount1 = new BankAccount();

        // bankAccount1.setAccountNumber();
        bankAccount1.setAccountHolderName ("Bishal Karki");
        bankAccount1.setBankBalance(7000);
        bankAccount1.bankName = "bank of america";
        bankAccount1.setConnectedMobileNumber("9849018753");
        bankAccount1.setAddress("Hawaii Honolulu");
        bankAccount1.setBankAccountType("BankAccountType.string");


        BankAccount bankAccount2 = new BankAccount();




        // bankAccount2.setAccountNumber();
        bankAccount2.setAccountHolderName ("Bishal Karki");
        bankAccount2.setBankBalance(7000);
        bankAccount2.bankName = "bank of america";
        bankAccount2.setConnectedMobileNumber("9849018753");
        bankAccount2.setAddress("Hawaii Honolulu");
        bankAccount2.setBankAccountType("day10.BankAccount.String");


        boolean isInSameMemoryLocation = bankAccount1 == bankAccount2;
        System.out.println(isInSameMemoryLocation);

        boolean isInSameMemoryLocation1 = bankAccount1.equals(bankAccount2);
        System.out.println(isInSameMemoryLocation1);

        BankAccount bankAccount3 = new BankAccount("12345678","ABC", "BankAccountType.String","Hawaii Honolulu","BankOfWellsFargo",979);

    }
}
