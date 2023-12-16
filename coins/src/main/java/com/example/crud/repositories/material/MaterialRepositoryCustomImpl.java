package com.example.crud.repositories.material;

import com.example.crud.ex.ModelNotFoundException;
import com.example.crud.models.Material;
import org.springframework.context.annotation.Lazy;


public class MaterialRepositoryCustomImpl implements MaterialRepositoryCustom {

    private final MaterialRepository materialRepository;

    public MaterialRepositoryCustomImpl(@Lazy MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    @Override
    public Material getMaterialFromDb(Long id) {
        return materialRepository.findById(id).orElseThrow(() ->
                new ModelNotFoundException("Material with id = %s not found".formatted(id)));
    }
}
