package day2;

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
    String bankAccountType;


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



    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }
    //Behaviour

    //-Open Account
    //-Close Account
    //-Deposit
    //-Withdraw
    //-Transfer
}