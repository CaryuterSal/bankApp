package org.example;

import java.util.Optional;

public interface AccountRepository {
    Account save(Account account);
    void delete(Account account);
    Optional<Account> findByCardNumber(String cardNumber);
}
