package org.example;

import java.math.BigInteger;

public class Account {
    private String name;
    private BigInteger money;
    private String cardNumber;

    public Account(String name, BigInteger money, String cardNumber) {
        this.name = name;
        this.money = money;
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getMoney() {
        return money;
    }

    public void deposit(BigInteger quantity){
        if(quantity.compareTo(BigInteger.ZERO) <= 0){
            throw new ValidationException("quantity must be positive");
        }
        money = money.add(quantity);
    }
    public void withdraw(BigInteger quantity){
        if (quantity == null) {
            throw new ValidationException("quantity cannot be null");
        }
        if (quantity.compareTo(BigInteger.ZERO) <= 0) {
            throw new ValidationException( "quantity must be positive");
        }
        if(money.compareTo(quantity) < 0){
            throw new ValidationException( "not enough money");
        }
        money = money.subtract(quantity);
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
