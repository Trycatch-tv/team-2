package com.team2.team2.Service;

import com.team2.team2.entities.Marca;
import com.team2.team2.entities.Proceso;

import java.util.List;

public interface InterfazServiceProceso {
    Proceso finbyid(long id);

    List<Proceso> findAll();

    void Delete(long id);

    void save(Proceso proceso);
}
