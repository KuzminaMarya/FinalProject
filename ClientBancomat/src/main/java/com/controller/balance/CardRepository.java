package com.controller.balance;

import com.controller.balance.Card;
import org.springframework.data.repository.CrudRepository;


public interface CardRepository extends CrudRepository<Card, Long> {
}
