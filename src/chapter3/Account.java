package chapter3;

import java.util.Date;

class Account {
    private String customer;
    private int account;
    private String agency;
    private double amount;
    private final Date openDate = new Date(System.currentTimeMillis());

    public Account(String customer, int account, String agency, double amount, String openDate) {
        this.customer = customer;
        this.account = account;
        this.agency = agency;
        this.amount = amount;
    }
}
