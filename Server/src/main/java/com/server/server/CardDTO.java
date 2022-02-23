package com.server.server;

import lombok.Value;

@Value
public class CardDTO {
    private Long id;
    private String cardNum;
    private int ammount;
    private String cur;
}
