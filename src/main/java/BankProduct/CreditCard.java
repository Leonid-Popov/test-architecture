package BankProduct;

import lombok.Getter;

@Getter
public abstract class CreditCard extends CardProduct {

    protected float interestRate;
    protected double debt;

    /**
     * Запрос задолженности.
     */
    public abstract double creditDebt();
}
