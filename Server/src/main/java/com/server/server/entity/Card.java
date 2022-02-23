package com.server.server.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cardNum;
    private int ammount;
    private String cur;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getCur() {
        return cur;
    }

    public Card(String cardNum, int ammount, String cur){
        this.cardNum=cardNum;
        this.ammount=ammount;
        this.cur=cur;
    }

    public Card(){
    }
}
