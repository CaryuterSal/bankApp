package org.example;

import java.math.BigInteger;

public class Account {
    private String name;
    private BigInteger money;
    private String cardNumber;

    public Account(String name, BigInteger money, String cardNumber, int nip) {
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

    public String deposit(BigInteger quantity){
        if(quantity.compareTo(BigInteger.ZERO) <= 0){
            return "quantity must be positive";
        }else{
            money = money.add(quantity);
            return "success";
        }
    }
    public String withdraw(BigInteger quantity){
        if (quantity == null) {
            return "quantity cannot be null";
        }
        if (quantity.compareTo(BigInteger.ZERO) <= 0) {
            return "quantity must be positive";
        }
        if(money.compareTo(quantity) < 0){
            return "not enough money";
        }
        money = money.subtract(quantity);
        return "success";
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
