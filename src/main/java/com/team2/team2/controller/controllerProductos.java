package com.team2.team2.controller;


import com.team2.team2.Service.InterfazServiceProdutos;
import com.team2.team2.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

//@RequestMapping: define le URL donde se hara la peticion (http://localhost:8080/productos"/(end poit al que deseo ingresar))
@RequestMapping("productos")
public class controllerProductos {
    //_____________________________________________SERVICIOS________________________________________
    ////@Autowired: TRAE INTERFAZ DEL IserviceUsers  (BASE DE DATOS) y pordebajo toda la logica de ImpleServicesUsers
    @Autowired
    private InterfazServiceProdutos interfazServiceProdutos;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces="application/json")

    public @ResponseBody Producto findById (@PathVariable long id) {

        return interfazServiceProdutos.finbyid(id);
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET,produces="application/json")

    public @ResponseBody List<Producto> findAll () {
        List<Producto> listaProductos=this.interfazServiceProdutos.findAll();
        return listaProductos;
    }

}
