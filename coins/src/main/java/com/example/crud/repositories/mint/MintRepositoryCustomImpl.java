package com.example.crud.repositories.mint;

import com.example.crud.ex.ModelNotFoundException;
import com.example.crud.models.Mint;
import org.springframework.context.annotation.Lazy;

public class MintRepositoryCustomImpl implements MintRepositoryCustom {
    private final MintRepository mintRepository;

    public MintRepositoryCustomImpl(@Lazy MintRepository mintRepository) {
        this.mintRepository = mintRepository;
    }

    @Override
    public Mint getMintFromDb(Long id) {
        return mintRepository.findById(id).orElseThrow(() ->
                new ModelNotFoundException("Mint with id = %s not found".formatted(id)));
    }
}
