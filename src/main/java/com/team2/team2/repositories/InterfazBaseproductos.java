package com.team2.team2.repositories;

import com.team2.team2.entities.Producto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterfazBaseproductos extends JpaRepository<Producto,Long> {

        Producto findByid (long id);

        @Override
        List<Producto> findAll();
}
