package org.example;

public interface AccountRepository {
    Account save(Account account);
    void delete(Account account);
    int findByCardNumber(String )
}
