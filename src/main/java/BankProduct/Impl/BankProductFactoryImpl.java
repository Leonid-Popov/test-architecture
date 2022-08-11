package BankProduct.Impl;

import BankProduct.*;

public class BankProductFactoryImpl implements BankProductFactory {

    @Override
    public CreditCard buildCreditCard(String name) {
        CreditCard card = new CreditCardImpl();
        card.setName(name);
        return card;
    }

    @Override
    public DebitCard buildDebitCard() {
        return new DebitCardImpl();
    }

    @Override
    public CurrencyDebitCard buildCurrencyDebitCard() {
        return new CurrencyDebitCardImpl();
    }

    @Override
    public Deposit buildDeposit() {
        return new DepositImpl();
    }
}
