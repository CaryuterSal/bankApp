package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryAccountRepository implements AccountRepository{

    private final Map<String, Account> accounts = new HashMap<>();

    @Override
    public Account save(Account account) {
        return accounts.put(account.getCardNumber(), account);
    }

    @Override
    public void delete(Account account) {
        accounts.remove(account.getCardNumber());
    }

    @Override
    public Optional<Account> findByCardNumber(String cardNumber) {
        return Optional.ofNullable(accounts.get(cardNumber));
    }
}
