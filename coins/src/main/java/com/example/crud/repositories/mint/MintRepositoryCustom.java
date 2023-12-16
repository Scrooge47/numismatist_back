package com.example.crud.repositories.mint;

import com.example.crud.models.Mint;

interface MintRepositoryCustom {
    Mint getMintFromDb(Long id);
}
