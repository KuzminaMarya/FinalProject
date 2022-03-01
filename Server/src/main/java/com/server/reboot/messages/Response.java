package com.server.reboot.messages;

import com.server.reboot.Balance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Response {
    private Balance balance;

    public String print(){
        return balance.getBalance()+" "+balance.getCurrency();
    }
}
