package com.team2.team2.entities;

import jakarta.persistence.*;

import java.sql.Date;
//(BD)@Entity :CREA LA TABLA (Department) EN BASE EN LA CLASE  (Department)
@Entity
//@Table:CREO LA ENTIDAD (Department) EN LA BASE DE DATOS
@Table(name="Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    //@Column crea la columna nombre
    @Column(name = "nombre")
    private String nombre;
    //@Column crea la columna nombre
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "cantidad")
    private long cantidad;
    @Column(name = "precio")
    private long precio;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "fechaCreacion")
    private String fechaCreacion;
    @Column(name = "fechaModificacion")
    private String fechaModificacion;
    @Column(name = "estado")
    private String estado;

    public Producto(){};

    public Producto(long id, String nombre, String descripcion, long cantidad, long precio, String imagen, String fechaCreacion, String fechaModificacion, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.imagen = imagen;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String  getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String  getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
