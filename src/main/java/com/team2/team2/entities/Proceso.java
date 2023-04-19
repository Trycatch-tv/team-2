package com.team2.team2.entities;

import jakarta.persistence.*;

//(BD)@Entity :CREA LA TABLA (Department) EN BASE EN LA CLASE  (Department)
@Entity
//@Table:CREO LA ENTIDAD (Department) EN LA BASE DE DATOS
@Table(name="Proceso")
public class Proceso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    //@Column crea la columna nombre
    @Column(name = "proceso")
    private String proceso;
    //@Column crea la columna nombre
    @Column(name = "estado")
    private String estado;

    public Proceso() {
    }

    public Proceso(long id, String proceso, String estado) {
        this.id = id;
        this.proceso = proceso;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
