package BankProduct;

public interface BankProductFactory {
    CreditCard buildCreditCard(String name);
    DebitCard buildDebitCard();
    CurrencyDebitCard buildCurrencyDebitCard();
    Deposit buildDeposit();
}
