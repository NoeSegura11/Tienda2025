/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.tienda.service;
import java.util.List;
import com.tienda.domain.Categoria;

public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
    

}
