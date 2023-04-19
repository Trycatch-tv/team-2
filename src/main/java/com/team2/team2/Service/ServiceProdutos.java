package com.team2.team2.Service;

import com.team2.team2.entities.*;
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
        Producto producto= this.interfazBaseproductos.findByid(id);
        if (producto== null){
            Proceso proceso= new Proceso(0,"","");
            UnidadMedida unidadMedida= new UnidadMedida(0,0,"","");
            Marca marca1= new Marca(0,"","");
            Categoria categoria1= new Categoria(0,0,"","","","");
            Producto producto1= new Producto(0,"no encontrado","",0,0,"","","","",categoria1,marca1,unidadMedida, proceso);
            return producto1;
        }else{
            return producto;
        }
    }
    @Override
    public List<Producto> findAll( ){
        List<Producto> listdeproducto=interfazBaseproductos.findAll();

        return listdeproducto;
    }

    @Override
    public void Delete(long id) {
        this.interfazBaseproductos.deleteById(id);
    }
    @Override
    public void save(Producto producto) {
        this.interfazBaseproductos.save(producto);
    }
}
