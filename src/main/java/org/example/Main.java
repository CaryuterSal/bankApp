package org.example;


import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankService service = new BankApplicationService(new InMemoryAccountRepository());

        System.out.println("Welcome to Bank Service \n");
        System.out.println("Please chooise an option: ");
        System.out.println("1. Create Account");
        System.out.println("2 - Deposit");
        System.out.println("3 - Get account info");
        System.out.println("4 - Transfer");
        System.out.println("5 - Withdraw");
        System.out.println("6 - Exit");
        int option = scan.nextInt();

        do {
            switch (option) {
                case 1:
                    System.out.println("Enter account number: ");
                    String accountNumber = scan.next();
                    System.out.println("Enter account name: ");
                    String accountName = scan.next();
                    service.createAccount(accountNumber, accountName);

                    break;
                case 2:
                    System.out.println("Enter account name: ");
                    String accountNam = scan.next();
                    System.out.println("Enter quantity: ");
                    BigInteger quantity = new BigInteger(scan.next());
                    try {
                        service.deposit(accountNam, quantity);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Enter account name: ");
                    String accountNme = scan.next();
                    service.getAccountInfo(accountNme);
                    break;

                case 4:
                    System.out.println("Enter source account number: ");
                    String account = scan.next();
                    System.out.println("Enter target account number: ");
                    String targetAccount = scan.next();
                    System.out.println("Enter quantity: ");
                    BigInteger quantity2 = new BigInteger(scan.next());
                    try {
                        service.transferToAccount(account, targetAccount, quantity2);
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 5:
                    System.out.println("Enter name account: ");
                    String nameAccount = scan.next();
                    System.out.println("Enter quantity: ");
                    BigInteger quantity3 = new BigInteger(scan.next());
                    try {
                        service.withdraw(nameAccount, quantity3);
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Option Not Found");
            }
        }while (option != 6);



    }
}