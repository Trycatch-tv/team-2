package com.team2.team2.Service;

import com.team2.team2.entities.Producto;
import com.team2.team2.repositories.InterfazBaseproductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProdutos implements InterfazServiceProdutos {
    @Autowired
    private InterfazBaseproductos interfazBaseproductos;
    public Producto finbyid( long id){
        //Producto producto= new Producto(1,"zapatos","zapato de cuero",1,23000,"","2015-03-31","2015-03-31","agotado");

        Producto producto= interfazBaseproductos.findByid(id);
        return producto;
    }
    public List<Producto> findAll( ){
        List<Producto> listdeproducto=interfazBaseproductos.findAll();

        return listdeproducto;
    }
}
