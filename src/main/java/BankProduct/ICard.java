package BankProduct;

public interface ICard {

    //пополнение, списание, запрос баланса
    //replenishment

    /**
     * Пополненение карты.
     *
     * @param sum - сумма пополнения.
     */
    void replenishment(double sum);

    void writeOff(double sum);

    double balanceRequest();

}
