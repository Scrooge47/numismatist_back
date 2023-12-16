package com.example.crud.mappers;

import com.example.crud.dto.MaterialDto;
import com.example.crud.dto.NewMaterialDto;
import com.example.crud.models.Material;

public class MaterialMapper {

    public static Material toMaterial(NewMaterialDto newMaterialDto) {
        Material material = new Material();
        material.setType(newMaterialDto.getType());
        return material;
    }

    public static MaterialDto toMaterialDto(Material material) {
        MaterialDto materialDto = new MaterialDto();
        materialDto.setId(material.getId());
        materialDto.setType(material.getType());

        return materialDto;
    }

}
