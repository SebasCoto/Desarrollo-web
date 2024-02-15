
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")

public class Categoria implements Serializable{
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Categoria")
    private Long idCategoria; //Esto equivale en la DB como id_categoria, ya que en java se usa camelCase
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    public Categoria(){
    
    }

    public Categoria(Long idCategoria, String descripcion, String rutaIamgen, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.rutaImagen = rutaIamgen;
        this.activo = activo;
    }
    
    
    


}
