package com.siniva.mongo.mongowebsiniva.Controlador;

import java.util.ArrayList;
import java.util.Optional;

import javax.swing.text.html.Option;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siniva.mongo.mongowebsiniva.Modelo.ProdutDTO;
import com.siniva.mongo.mongowebsiniva.Servicio.ProductDTOservicio;

@RestController
@RequestMapping("/productoss") // cuando ingrese al url para q bote la informacion del controlador 
public class ProductControlador {

    @Autowired
    ProductDTOservicio productDTOservicio; //controlador se conecta con servicio

    @PostMapping //metodo para guardar los datos de modelo 
    public  ProdutDTO guardardatos (@Validated @RequestBody ProdutDTO Productos){
        return this.productDTOservicio.guardarDatos(Productos);
    }

    @GetMapping // metodo para que nos muestre los datos guardados en la base de datos
    public ArrayList<ProdutDTO> llistarproductos(){
        return this.productDTOservicio.listarproductos();
    }

    @GetMapping (path = "/{id}")// metodo para q muestre los datos por medio del id 
    public Optional <ProdutDTO> burcarporId(@PathVariable("id") String id){
        return this.productDTOservicio.buscarporId(id); 

    }

    @PutMapping (path = "/{id}") // metodo para q envie el id que va enviar a mostrar al postam
    public ProdutDTO update(@PathVariable String id, @Validated @RequestBody ProdutDTO producto){
        return this.productDTOservicio.update(producto, id);
    }
    
    @DeleteMapping (path = "/{id}")
    public String eliminarid(@PathVariable("id") String id) {
        boolean ok = this.productDTOservicio.eliminarid(id);
        if (ok) {
            return "Se elimino con exito";
        } else {
            return "No se elimino porque no se encontro en la base de datos";
        }

    }
    

}

    

