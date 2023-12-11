package com.example.crud.repositories;

import com.example.crud.models.Price;
import com.example.crud.models.PriceKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, PriceKey> {

}
