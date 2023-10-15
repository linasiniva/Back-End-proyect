package com.siniva.mongo.mongowebsiniva.Servicio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siniva.mongo.mongowebsiniva.Modelo.ProdutDTO;
import com.siniva.mongo.mongowebsiniva.Repositorio.ProductRepositorio;

@Service
public class ProductDTOservicio {
    @Autowired //la instancia 
    ProductRepositorio productRepositorio;

    public ProductDTOservicio(){

    }
    //metodo para guardar los datos 
    public ProdutDTO guardarDatos(ProdutDTO product){
        return this.productRepositorio.insert(product);
    }
    //metodo para listar los productos para poderlo mostrar con GetMapping para que nos muestre los datos guardados en la base de datos
    public ArrayList<ProdutDTO> listarproductos(){
        //los productos que tome los guarde en un array 
        return (ArrayList<ProdutDTO>) this.productRepositorio.findAll();
    }

    public Optional<ProdutDTO> buscarporId(String id){
        return this.productRepositorio.findById(id);
    }

    public ProdutDTO update(ProdutDTO product, String id){
        return this.productRepositorio.save(product);
    }
    public boolean eliminarid(String id) {
        try{
            productRepositorio.deleteById(id);
            return true;
        }catch (Exception er){
            return false;
        }
        
    }
   
   
    
}
