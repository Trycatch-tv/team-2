package com.team2.team2.Service;

import com.team2.team2.entities.Producto;

import java.util.List;

public interface InterfazServiceProdutos {

    public Producto finbyid(long id);


    public List<Producto> findAll();

    public void Delete (long id);

    void save(Producto producto);
}
