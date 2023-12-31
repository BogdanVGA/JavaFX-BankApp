package com.fxapp.bankapp.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Account {

    private final StringProperty owner;
    private final StringProperty accountNumber;
    private DoubleProperty balance;

    public Account(String owner, String accountNumber, double balance) {
        this.owner = new SimpleStringProperty(this, "Owner", owner);
        this.accountNumber = new SimpleStringProperty(this, "Account Number", accountNumber);
        this.balance = new SimpleDoubleProperty(this, "Balance", balance);
    }

    public StringProperty getOwnerProperty() {
        return this.owner;
    }

    public StringProperty getAccountNumberProperty() {
        return this.accountNumber;
    }

    public DoubleProperty getBalanceProperty() {
        return this.balance;
    }

    public void setBalance(double newBalance) {
        this.balance.set(newBalance);
    }
}
