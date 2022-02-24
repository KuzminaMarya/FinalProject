package com.client.service;

import com.bank.reboot.Bankomat;
import com.bank.reboot.Client;
import com.server.reboot.Balance;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@Service
public class BankomatService {
    public Balance getClientBalance(Client client) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return Bankomat.insertCard(client);
    }
}
