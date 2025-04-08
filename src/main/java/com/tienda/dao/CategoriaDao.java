
package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {

    public List<Categoria> findByDescripcionContainingOrderByDescripcionDesc(String descripcion);

}
