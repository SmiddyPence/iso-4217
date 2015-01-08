package com.nps.iso.repository;

import com.nps.iso.domain.Currency;
import com.nps.iso.domain.Entity;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface EntityRepository extends Repository<Entity, Integer> {

    List<Entity> findAll();

    Entity findByName(String name);

}
