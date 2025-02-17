
package com.tienda.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.domain.Categoria;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {

}
