package com.server.server.service;

import com.server.server.CardDTO;
import com.server.server.entity.Card;
import com.server.server.repository.CardRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CardService {

    private CardRepository cardRepository;

    public CardDTO getCard(Long id) {
        Card card = cardRepository.findById(id).get();
        return new CardDTO(card.getId(),card.getCardNum(), card.getAmmount(), card.getCur());
    }

    public List<CardDTO> getAllCards(){
        Iterable<Card> cardIterable = cardRepository.findAll();
        List<CardDTO> cards = new ArrayList<>();
        cardIterable.forEach(
                card -> {
                    cards.add(new CardDTO(card.getId(),card.getCardNum(), card.getAmmount(), card.getCur()));
                }
        );
        return cards;
    }
}
