package com.example.crud.repositories;

import com.example.crud.models.Mint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MintRepository extends JpaRepository<Mint, Long> {
}
