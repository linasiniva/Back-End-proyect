package com.siniva.mongo.mongowebsiniva.Modelo;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Productos") // en mongodb se manejan son documentos no tablas como en mysql la base de datos su collection se llama productos

public class ProdutDTO {
    @Id //colleciones base de datos no relacionales este id de depencia tiene un atribudo _id
    
    // atributos privados 
    private String  _id;
    private String nombre;
    private String correo;
    private Double precio;
    private LocalDate fecha_expirar;


    // constructor de la clase
    public ProdutDTO(){

    }

    //  se generaron los get y set de los atributos

    public String get_id() {
        return _id;
    }



    public void set_id(String _id) {
        this._id = _id;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Double getPrecio() {
        return precio;
    }



    public void setPrecio(Double precio) {
        this.precio = precio;
    }



    public LocalDate getFecha_expirar() {
        return fecha_expirar;
    }



    public void setFecha_expirar(LocalDate fecha_expirar) {
        this.fecha_expirar = fecha_expirar;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
