package com.server.server.repository;

import com.server.server.entity.Card;
import org.springframework.data.repository.CrudRepository;


public interface CardRepository extends CrudRepository<Card, Long> {
}
