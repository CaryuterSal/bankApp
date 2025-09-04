package org.example;


import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static int option;
    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        BankService service = new BankApplicationService(new InMemoryAccountRepository());


        System.out.println("Welcome to Bank Service \n");
        getMenuOption();
        do {
            switch (option) {
                case 1:
                    System.out.println("Enter account number: ");
                    String accountNumber = scan.next();
                    System.out.println("Enter account name: ");
                    String accountName = scan.next();
                    try {

                        service.createAccount(accountNumber, accountName);
                        System.out.println("Account created successfully");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter account name: ");
                    String accountNam = scan.next();
                    System.out.println("Enter quantity: ");
                    BigInteger quantity = new BigInteger(scan.next());
                    try {
                        service.deposit(accountNam, quantity);
                        System.out.println("Deposited successfully");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Enter account name: ");
                    String accountNme = scan.next();
                    Account retrievedAccount = service.getAccountInfo(accountNme);
                    printAccount(retrievedAccount);
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
                        System.out.println("Transfer successfully");
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
                        System.out.println("Withdraw successfully");
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Option Not Found");
            }
            getMenuOption();
        }while (option != 6);
    }

    private static void printAccount(Account account) {
        printSeparator();
        printAccountField("name", account.getName());
        System.out.println();
        printAccountField("card number", account.getCardNumber());
        System.out.println();
        printAccountField("balance", account.getMoney());
        System.out.println();
        printSeparator();
    }

    private static void printSeparator(){
        System.out.println("----------------------------");
    }

    private static void printAccountField(String fieldName, Object fieldValue){
        System.out.printf("\t%s\t\t\t", fieldName);
        System.out.print(fieldValue);
    }

    public static void getMenuOption(){
        System.out.println("Please chooise an option: ");
        System.out.println("1. Create Account");
        System.out.println("2 - Deposit");
        System.out.println("3 - Get account info");
        System.out.println("4 - Transfer");
        System.out.println("5 - Withdraw");
        System.out.println("6 - Exit");
        option = scan.nextInt();
    }
}