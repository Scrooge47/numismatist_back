package com.example.crud.controllers.admin;


import com.example.crud.dto.MaterialDto;
import com.example.crud.dto.NewMaterialDto;
import com.example.crud.dto.UpdateMaterialDto;
import com.example.crud.services.material.MaterialService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController("admin")
@AllArgsConstructor
public class MaterialController {

    private MaterialService materialService;

    @PostMapping("/material")
    @ResponseStatus(HttpStatus.CREATED)
    public MaterialDto createMaterial(@RequestBody NewMaterialDto materialDto) {
        return materialService.save(materialDto);
    }

    @GetMapping("/material/{materialId}")
    @ResponseStatus(HttpStatus.OK)
    public MaterialDto getMaterial(@PathVariable Long materialId) {
        return materialService.get(materialId);
    }

    @DeleteMapping("/material/{materialId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMaterial(@PathVariable Long materialId) {
        materialService.delete(materialId);
    }

    @PatchMapping("/material/{materialId}")
    @ResponseStatus(HttpStatus.OK)
    public MaterialDto updateMaterial(@PathVariable Long materialId, @RequestBody UpdateMaterialDto materialDto) {
        return materialService.update(materialId, materialDto);
    }
}
