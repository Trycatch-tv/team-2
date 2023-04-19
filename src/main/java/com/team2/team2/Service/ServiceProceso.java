package com.team2.team2.Service;

import com.team2.team2.entities.Proceso;
import com.team2.team2.repositories.InterfazBaseProceso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceProceso implements InterfazServiceProceso{
    @Autowired
    private InterfazBaseProceso interfazBaseProceso;

    @Override
    public Proceso finbyid(long id){

        Proceso proceso= this.interfazBaseProceso.findByid(id);
        if (proceso== null){

            Proceso proceso1= new Proceso(0,"","");
            return proceso1;
        }else{
            return proceso;
        }
    }
    @Override
    public List<Proceso> findAll(){
        List<Proceso> listdeMarca=this.interfazBaseProceso.findAll();
        return listdeMarca;
    }
    @Override
    public void Delete(long id) {
        this.interfazBaseProceso.deleteById(id);

    }
    @Override
    public void save(Proceso proceso) {
        this.interfazBaseProceso.save(proceso);
    }

}
