package org.example;

import java.math.BigInteger;

public class BankApplicationService implements BankService{

    @Override
    public void deposit(String accountName, BigInteger quantity) {

    }

    @Override
    public Account getAccountInfo(String accountName) {
        return null;
    }

    @Override
    public void transferToAccount(String sourceAccount, String targetAccount, BigInteger quantity) {

    }
}
