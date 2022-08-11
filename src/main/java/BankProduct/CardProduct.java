package BankProduct;

public class CardProduct extends BankProduct implements ICard {

    @Override
    public void replenishment(double sum) {
        balance += sum;
    }

    @Override
    public void writeOff(double sum) {
        balance -= sum;
    }

    @Override
    public double balanceRequest() {
        return balance;
    }
}
