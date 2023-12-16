package com.example.crud.services.material;

import com.example.crud.dto.MaterialDto;
import com.example.crud.dto.NewMaterialDto;
import com.example.crud.dto.UpdateMaterialDto;
import com.example.crud.mappers.MaterialMapper;
import com.example.crud.models.Material;
import com.example.crud.repositories.material.MaterialRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MaterialServiceImpl implements MaterialService {

    private MaterialRepository materialRepository;

    @Override
    public MaterialDto save(NewMaterialDto MaterialDto) {
        Material material = MaterialMapper.toMaterial(MaterialDto);
        return MaterialMapper.toMaterialDto(materialRepository.save(material));
    }

    @Override
    public MaterialDto get(Long id) {
        return MaterialMapper.toMaterialDto(materialRepository.getMaterialFromDb(id));
    }

    @Override
    public void delete(Long id) {
        Material material = materialRepository.getMaterialFromDb(id);
        materialRepository.delete(material);
    }

    @Override
    public MaterialDto update(Long id, UpdateMaterialDto newMaterialDto) {
        Material material = materialRepository.getMaterialFromDb(id);
        if (!newMaterialDto.getType().isBlank()) {
            material.setType(newMaterialDto.getType());
        }

        return MaterialMapper.toMaterialDto(materialRepository.save(material));
    }
}
