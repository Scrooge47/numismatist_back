package com.example.crud.repositories.material;

import com.example.crud.models.Material;

public interface MaterialRepositoryCustom {
    Material getMaterialFromDb(Long id);
}
