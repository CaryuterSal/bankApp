package org.example;

import java.math.BigInteger;

public interface BankService {
    void deposit(String cardNumber, BigInteger quantity);
    void withdraw(String cardNumber, BigInteger quantity);
    Account getAccountInfo(String cardNumber);
    void transferToAccount(String sourceCard, String targetCard, BigInteger quantity);
    void createAccount(String cardNumber, String name);
    void createAccount(String cardNumber, String name, BigInteger initialQuantity);
}
