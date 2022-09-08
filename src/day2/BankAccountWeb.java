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











    }
}
