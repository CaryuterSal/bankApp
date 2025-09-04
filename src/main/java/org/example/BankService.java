package org.example;

import java.math.BigInteger;

public interface BankService {
    void deposit(String accountName, BigInteger quantity);
    Account getAccountInfo(String accountName);
    void transferToAccount(String sourceAccount, String targetAccount, BigInteger quantity);
}
