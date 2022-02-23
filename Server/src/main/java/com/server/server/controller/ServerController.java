package com.server.server.controller;

import com.server.reboot.Balance;
import com.server.reboot.messages.Request;
import com.server.reboot.messages.Response;
import com.server.server.CardDTO;
import com.server.server.service.CardService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@Log

public class ServerController {

    @Autowired
    private CardService cardService;



    @GetMapping("/cards")
    public List<CardDTO> getClientsInfo() {
        return cardService.getAllCards();
    }

    @GetMapping("/card/{cardId}")
    public String getBalance(@PathVariable("cardId") Long cardId) {
        Response response = new Response(new Balance(cardService.getCard(cardId).getAmmount(), cardService.getCard(cardId).getCur()));
        log.info(response.print());
        return response.print();
    }

    @PostMapping("/card/{cardId}")
    public Response getBalance(@PathVariable("cardId") Long cardId,
                             @RequestBody Request request) {

        log.info(request.toString());
        Response response = new Response(new Balance(cardService.getCard(cardId).getAmmount(), cardService.getCard(cardId).getCur()));
        log.info(response.print());
        return response;
    }
}
