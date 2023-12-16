package com.example.crud.repositories.material;

import com.example.crud.models.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Long>, MaterialRepositoryCustom {
}
