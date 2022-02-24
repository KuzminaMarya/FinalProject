package com.bank.reboot;

import com.server.reboot.Balance;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class ClientBancomatTest {
    @Test
    void getBalanceCardTest() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Client client=new Client("Мария Владимировна Иванова","1234 567890", "1234567887654321");
        Balance balance=Bankomat.insertCard(client);
        assertEquals("RUR",balance.getCurrency());
        assertEquals(36000,balance.getBalance());
    }
}
