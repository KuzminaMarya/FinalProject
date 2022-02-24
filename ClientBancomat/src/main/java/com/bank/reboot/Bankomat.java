package com.bank.reboot;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.SQLException;

import com.server.reboot.Balance;
import com.server.reboot.Server;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Bankomat {
    private String ATMId;
    public static Balance insertCard(Client client)  {
       return Server.getBalanceCard(client.getCardNum());
    }
}
