package BankProduct;

public abstract class Deposit extends BankProduct{
    /**
     * Пополненение карты.
     *
     * @param sum - сумма пополнения.
     */
    public abstract void replenishment(double sum);

    public abstract double balanceRequest();

    public abstract void closeDeposit();
}
