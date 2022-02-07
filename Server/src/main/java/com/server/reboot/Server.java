package com.server.reboot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Server {
    public static Balance getBalanceCard(String cardNum){
        return new Balance(Cur.RUR.toString(), 100);
    }
}
