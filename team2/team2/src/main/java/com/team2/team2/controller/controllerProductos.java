package com.team2.team2.controller;


import com.team2.team2.entities.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

//@RequestMapping: define le URL donde se hara la peticion (http://localhost:8080/productos"/(end poit al que deseo ingresar))
@RequestMapping("productos")
public class controllerProductos {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces="application/json")

    public @ResponseBody Producto findById (@PathVariable long id) {

        Producto producto= new Producto(1,"zapatos","zapato de cuero",1,23000,"","2015-03-31","2015-03-31","agotado");


        return producto;
    }

}
