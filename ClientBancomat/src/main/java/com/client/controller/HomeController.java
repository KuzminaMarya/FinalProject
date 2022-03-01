package com.client.controller;

import com.bank.reboot.Client;
import com.client.service.BankomatService;
import com.server.reboot.Balance;
import com.server.reboot.messages.Request;
import com.server.reboot.messages.RequestTypes;
import lombok.extern.java.Log;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@RestController
@Log
public class HomeController {
    private BankomatService atmService;

    public HomeController(BankomatService atmService) {
        this.atmService = atmService;
    }

    @GetMapping("/ready")
    public String getBankomatStatus() {
        return "Банкомат готов";
    }

    @GetMapping("/clients/{fio}/{dul}/{cardNum}/{cardId}")
    public String home( @PathVariable("fio") String fio,
                        @PathVariable("dul") String dul,
                        @PathVariable("cardNum") String cardNum,
                        @PathVariable("cardId") String cardId)  {

        log.info("client fio " + fio + " client dul " + dul + " client cardNum " + cardNum);

        Client client=new Client(fio,dul,cardNum);
        Balance balance=atmService.getClientBalance(client);
        String totalBalance= balance.getBalance() + " " + balance.getCurrency();

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Request> request = new HttpEntity<>(new Request(3, "{\"cardId\":"+cardId+"}", RequestTypes.JSON));

        log.info("request.toString()" + request.toString());

        ResponseEntity<String> responseEntityStr = restTemplate.postForEntity("http://localhost:8080/card/"+cardId,
                        request, String.class);
        log.info("responseEntityStr.getBody()" + responseEntityStr.getBody());

        return "Привет! Ваш баланс "+ totalBalance;
    }

}
