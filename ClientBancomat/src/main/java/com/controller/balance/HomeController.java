package com.controller.balance;

import com.bank.reboot.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Iterator;


@Controller
public class HomeController {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/")
    public String home(Model model){
        Iterable<Card> cards=cardRepository.findAll();
        Iterator<Card> cardsIterator=cards.iterator();
        Client client=new Client("Мария Владимировна Иванова","1234 567890", "1234567887654321");
        while(cardsIterator.hasNext()) {
            Card card=cardsIterator.next();
                if (card.getCardNum().equals(client.getCardNum())) {
                    String totalBalance = card.getAmmount() + " " + card.getCur();
                    model.addAttribute("balance", totalBalance);
                } else {
                    model.addAttribute("balance", "Карты нет");
                }
            }
        return "home";
    }

}
