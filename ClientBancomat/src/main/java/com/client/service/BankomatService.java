package com.client.service;

import com.bank.reboot.Bankomat;
import com.bank.reboot.Client;
import com.server.reboot.Balance;
import org.springframework.stereotype.Service;

@Service
public class BankomatService {
    public Balance getClientBalance(Client client) {
        return Bankomat.insertCard(client);
    }
}
