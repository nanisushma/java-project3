package day2;

/**
 * This application used by Bank of wells fargo
 *
 * @author Sushma Karki
 * @version 1.0.0
 */

public class BankAccount {

    //States
    private String accountNumber = "984018753";
     private String accountHolderName;
    private String connectedMobileNumber;
    private String address;
    String bankName;
    float bsbNumber;
    private double bankBalance;
    String socialSecurity;

    private BankAccountType BankAccountType;

   // private String street;
   // private String city;
   // private String state;
   // private int zip;

    private Address address1;




 public String getAccountNumber() {
  return accountNumber;
 }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getConnectedMobileNumber() {
        return connectedMobileNumber;
    }

    public void setConnectedMobileNumber(String connectedMobileNumber) {
        this.connectedMobileNumber = connectedMobileNumber;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public BankAccountType getBankAccountType() {
        return BankAccountType;}

    public void setBankAccountType(BankAccountType bankAccountType) {
        this.BankAccountType = bankAccountType;
    }
    //Behaviour

    //-Open Account
    //-Close Account
    //-Deposit
    //-Withdraw
    //-Transfer

    public void transferBalance(BankAccount fromAccount, BankAccount toAccount, double balance){
     double fromFinalBalance = fromAccount.getBankBalance()- balance;
     double toFinalBalance = toAccount.getBankBalance() + balance;

     fromAccount.setBankBalance(fromFinalBalance);
     toAccount.setBankBalance(toFinalBalance);
     }
    }
