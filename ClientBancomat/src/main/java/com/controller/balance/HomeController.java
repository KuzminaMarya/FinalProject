package com.controller.balance;

import com.bank.reboot.Bankomat;
import com.bank.reboot.Client;
import com.server.reboot.Balance;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        Client client=new Client("Мария Владимировна Иванова","1234 567890", "4673456123456789");
        Balance balance= Bankomat.insertCard(client);
        String sBalance=balance.getBalance()+" "+balance.getCurrency();
        model.addAttribute("balance", sBalance);
        return "home";
    }

}
