package BankProduct.Impl;

import BankProduct.Deposit;

public class DepositImpl extends Deposit {

    @Override
    public void replenishment(double sum) {
        balance += sum;
    }

    @Override
    public double balanceRequest() {
        return balance;
    }

    @Override
    public void closeDeposit() {
        //do something
    }
}
