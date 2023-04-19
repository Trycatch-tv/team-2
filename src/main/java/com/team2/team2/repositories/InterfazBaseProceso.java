package com.team2.team2.repositories;

import com.team2.team2.entities.Marca;
import com.team2.team2.entities.Proceso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterfazBaseProceso extends JpaRepository<Proceso,Long> {

    Proceso findByid (long id);


    List<Proceso> findAll();
}
