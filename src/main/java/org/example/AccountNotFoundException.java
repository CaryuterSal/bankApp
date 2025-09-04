package org.example;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String cardNumber) {
        super("An account with card number '%s' couldn't be found".formatted(cardNumber));
    }
}
