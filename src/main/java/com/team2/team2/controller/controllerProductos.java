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

    @RequestMapping(value = "/{categoria}",method = RequestMethod.GET,produces="application/json")

    public @ResponseBody Producto findBycategoria (@PathVariable String categoria) {

        Producto producto= new Producto(1,"zapatos","zapato de cuero",1,23000,"","2015-03-31","2015-03-31","agotado");


        return producto;
    }

    @RequestMapping(value = "/all",method = RequestMethod.POST,produces="application/json")

    public @ResponseBody Producto findByall () {

        Producto producto= new Producto(1,"zapatos","zapato de cuero",1,23000,"","2015-03-31","2015-03-31","agotado");


        return producto;
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET,produces="application/json")

    public @ResponseBody Producto deleteById (@PathVariable long id) {

        Producto producto= new Producto(1,"zapatos","zapato de cuero",1,23000,"","2015-03-31","2015-03-31","agotado");


        return producto;
    }
    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET,produces="application/json")

    public @ResponseBody Producto editById (@PathVariable long id) {

        Producto producto= new Producto(1,"zapatos","zapato de cuero",1,23000,"","2015-03-31","2015-03-31","agotado");


        return producto;
    }

}
