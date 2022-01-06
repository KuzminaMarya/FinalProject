package com.bank.reboot;

import java.math.BigDecimal;

public class Client {
    private String fio;
    private String dul;
    private String cardNum;

    public Client(String fio, String dul, String cardNum){
        this.fio=fio;
        this.dul=dul;
        this.cardNum=cardNum;
    }

    public String getFio() {
        return fio;
    }

    public String getDul() {
        return dul;
    }

    public String getCardNum() {
        return cardNum;
    }
}
