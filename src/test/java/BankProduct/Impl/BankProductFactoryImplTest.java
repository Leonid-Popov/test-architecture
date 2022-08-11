package BankProduct.Impl;

import BankProduct.BankProductFactory;
import BankProduct.CreditCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankProductFactoryImplTest {

    @Test
    void buildCreditCard() {
        BankProductFactory factory = new BankProductFactoryImpl();
        CreditCard card = factory.buildCreditCard("expected");
        Assertions.assertEquals("expected", card.getName());
    }
}