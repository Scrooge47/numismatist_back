package com.example.crud.services.mint;

import com.example.crud.dto.*;

public interface MintService {

    MintDto save(Long countryId, NewMintDto newMintDto);

    MintDto get(Long countryId, Long mintId);

    void delete(Long countryId, Long mintId);

    MintDto update(Long countryId, Long mintId, UpdateMintDto mint);
}
