package com.bank.testingweb;

import com.bank.reboot.Bankomat;
import com.bank.reboot.Client;
import com.server.reboot.Balance;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        Client client=new Client("Мария Владимировна Иванова","1234 567890", "1234567887654321");
        Balance balance= Bankomat.insertCard(client);
        return balance.getBalance()+" "+balance.getCurrency();
    }

}
