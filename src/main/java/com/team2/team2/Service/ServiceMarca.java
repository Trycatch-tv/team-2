package com.team2.team2.Service;

import com.team2.team2.entities.Marca;
import com.team2.team2.repositories.InterfazBaseMarca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMarca implements InterfazServiceMarca{
    @Autowired
    private InterfazBaseMarca interfazBaseMarca;

    @Override
    public Marca finbyid(long id){

        Marca marca= this.interfazBaseMarca.findByid(id);
        if (marca== null){

            Marca marca1= new Marca(0,"","");
            return marca1;
        }else{
            return marca;
        }
    }
    @Override
    public List<Marca> findAll(){
        List<Marca> listdeMarca=this.interfazBaseMarca.findAll();
        return listdeMarca;
    }
    @Override
    public void Delete(long id) {
        this.interfazBaseMarca.deleteById(id);

    }
    @Override
    public void save(Marca marca) {
        this.interfazBaseMarca.save(marca);
    }



}
