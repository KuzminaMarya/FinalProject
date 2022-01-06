package com.bank.reboot;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class ClientBancomatTest {
    @Test
    void getBalanceCardTest(){
        Client client=new Client("Мария Владимировна Иванова","1234 567890", "46734561234567890");
        assertTrue(BigDecimal.TEN.equals(Bankomat.insertCard(client)));
    }
}
