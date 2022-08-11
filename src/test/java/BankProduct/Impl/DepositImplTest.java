package BankProduct.Impl;

import BankProduct.BankProductFactory;
import BankProduct.Deposit;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DepositImplTest {

    BankProductFactory factory = new BankProductFactoryImpl();
    Deposit deposit;

    @BeforeEach
    public void setUp() {
        deposit = factory.buildDeposit();
        deposit.setBalance(1);
    }

    @Test
    void replenishment() {
        deposit.replenishment(1);
        Assertions.assertEquals(2, deposit.getBalance());
    }

    @Test
    void balanceRequest() {
        Assertions.assertEquals(1, deposit.balanceRequest());
    }

    @Test
    void closeDeposit() {
        deposit.closeDeposit();
    }
}