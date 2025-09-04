package org.example;

public class Account {
    private String name;
    private String money;
    private String cardNumber;

    public Account(String name, String money, String cardNumber, int nip) {
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

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
