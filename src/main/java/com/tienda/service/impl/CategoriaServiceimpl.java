package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceimpl implements CategoriaService{
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(boolean activos) {
       List<Categoria> lista =categoriaDao.findAll();
       
       if(activos){
           //Remover los elementos inactivos
           lista.removeIf(c -> !c.isActivo()); // "->" sirve para ponerle un alias a algo, en este caso lista es Categoria pero con "->" es c
       }
       
       return lista;
    }

    
}
