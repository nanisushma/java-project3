package day10;

import day10.BankAccount;

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

    private String bankAccountType = "Saving";

       //Default
    public BankAccount() {}

    // Parameterizes Constructor//Overloading


    public BankAccount(String accountNumber, String accountHolderName, String connectedMobileNumber, String address, String bankName, float bsbNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.connectedMobileNumber = connectedMobileNumber;
        this.address = address;
        this.bankName = bankName;
        this.bsbNumber = bsbNumber;
        this.socialSecurity = socialSecurity;
        this.bankAccountType = bankAccountType;
    }

      //Parameterized Constructor


    public BankAccount(String accountNumber, String accountHolderName, String connectedMobileNumber, String address, String bankName, float bsbNumber, double bankBalance, String socialSecurity, String bankAccountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.connectedMobileNumber = connectedMobileNumber;
        this.address = address;
        this.bankName = bankName;
        this.bsbNumber = bsbNumber;
        this.bankBalance = bankBalance;
        this.socialSecurity = socialSecurity;
        this.bankAccountType = bankAccountType;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

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
