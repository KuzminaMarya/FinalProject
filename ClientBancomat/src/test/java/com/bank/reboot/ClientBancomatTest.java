package com.bank.reboot;

import com.server.reboot.Balance;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class ClientBancomatTest {
    @Test
    void getBalanceCardTest(){
        Client client=new Client("Мария Владимировна Иванова","1234 567890", "4673456123456789");
        Balance balance=Bankomat.insertCard(client);
        assertEquals("RUR",balance.getCurrency());
        assertEquals(100,balance.getBalance());
    }
}
