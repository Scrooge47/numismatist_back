package com.example.crud.services.material;

import com.example.crud.dto.*;

public interface MaterialService {
    MaterialDto save(NewMaterialDto MaterialDto);

    MaterialDto get(Long id);

    void delete(Long id);

    MaterialDto update(Long id, UpdateMaterialDto materialDto);

}
