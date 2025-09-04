package org.example;

import java.math.BigInteger;

public class BankApplicationService implements BankService{

    private final AccountRepository repository;

    public BankApplicationService(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(String cardNumber, BigInteger quantity) {
        Account account = getAccountInfo(cardNumber);
        account.deposit(quantity);
        repository.save(account);
    }

    @Override
    public Account getAccountInfo(String cardNumber) {
        return repository.findByCardNumber(cardNumber)
                .orElseThrow(() -> new AccountNotFoundException(cardNumber));
    }

    @Override
    public void transferToAccount(String sourceCard, String targetCard, BigInteger quantity) {
        Account sourceAccount = getAccountInfo(sourceCard);
        Account targetAccount = getAccountInfo(targetCard);
        sourceAccount.withdraw(quantity);
        targetAccount.deposit(quantity);

    }

    @Override
    public void withdraw(String cardNumber, BigInteger quantity) {
        Account account = getAccountInfo(cardNumber);
        account.withdraw(quantity);
    }

    @Override
    public void createAccount(String cardNumber, String name) {
        createAccount(cardNumber, name, BigInteger.ZERO);
    }

    @Override
    public void createAccount(String cardNumber, String name, BigInteger initialQuantity) {
        Account account = new Account(name, initialQuantity, cardNumber);
        repository.save(account);
    }
}
