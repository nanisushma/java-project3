package day2;

public class BankAccountWeb {

    public static void main(String[] args) {

        BankAccount bishalAccount= new BankAccount();

       // bishalAccount.setAccountNumber();
        bishalAccount.setAccountHolderName ("Bishal Karki");
        bishalAccount.setBankBalance(7000);
        bishalAccount.bankName = "bank of america";
        bishalAccount.setConnectedMobileNumber("9849018753");
        bishalAccount.setAddress("Hawaii Honolulu");
        bishalAccount.setBankAccountType("Saving");



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
        friendAccount.setBankAccountType("Saving");

        // Transfer 2000 from bishal account to friend account

        System.out.print("========Before Transaction=======");

        double bishalFinalBalance = bishalAccount.getBankBalance()- 2000;
        double friendFinalBalance = friendAccount.getBankBalance() + 2000;


        System.out.print("========After Transaction=======");
        bishalAccount.setBankBalance(bishalFinalBalance);
        friendAccount.setBankBalance(friendFinalBalance);




    }
}
