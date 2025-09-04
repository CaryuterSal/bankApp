package org.example;

import java.math.BigInteger;

public interface BankService {
    void deposit(String accountName, BigInteger quantity);
    void withdraw(String accountName, BigInteger quantity);
    Account getAccountInfo(String accountName);
    void transferToAccount(String sourceAccount, String targetAccount, BigInteger quantity);
    void createAccount(String cardNumber, String name);
    void createAccount(String cardNumber, String name, BigInteger initialQuantity);
}
