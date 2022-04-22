package chapter3;

import java.util.Date;

class Account {
    public String customer;
    public int account;
    public String agency;
    public double amount;
    public final Date openDate = new Date(System.currentTimeMillis());

    public Account(String customer, int account, String agency, double amount) {
        this.customer = customer;
        this.account = account;
        this.agency = agency;
        this.amount = amount;
    }

    public boolean withdraw(int value) {
        if (this.amount >= value) {
            this.amount -= value;
            return true;
        }

        return false;
    }

    public void deposit(int value) {
        this.amount += value;
    }

    public double calculateRentability() {
        return this.amount * 0.01;
    }

    public String recoveryDataForPrint() {
        return String.format("Cliente: %s\nConta: %d\nAgencia: %s\nSaldo: %.2f\nData de abertura: %s", this.customer, this.account, this.agency, this.amount, this.openDate);
    }
}
