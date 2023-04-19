package com.team2.team2.controller;


import com.team2.team2.Service.InterfazServiceMarca;
import com.team2.team2.Service.InterfazServiceProceso;
import com.team2.team2.entities.Marca;
import com.team2.team2.entities.Proceso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

//@RequestMapping: define le URL donde se hara la peticion (http://localhost:8080/productos"/(end poit al que deseo ingresar))
@RequestMapping("proceso")
public class controllerProceso {
    @Autowired
    private InterfazServiceProceso interfazServiceProceso;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces="application/json")

    public @ResponseBody Proceso findById (@PathVariable long id) {

        return this.interfazServiceProceso.finbyid(id);
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET,produces="application/json")

    public @ResponseBody List<Proceso> findAll () {
        List<Proceso> listaProceso=this.interfazServiceProceso.findAll();
        return listaProceso;
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET,produces="application/json")
    public @ResponseBody void findByIdEdit (@PathVariable long id) {

        this.interfazServiceProceso.Delete(id);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST,produces="application/json")
    public @ResponseBody void save (@RequestBody Proceso proceso) {

        this.interfazServiceProceso.save(proceso);
    }


}
