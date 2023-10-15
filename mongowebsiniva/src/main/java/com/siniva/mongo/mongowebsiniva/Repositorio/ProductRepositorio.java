package com.siniva.mongo.mongowebsiniva.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.siniva.mongo.mongowebsiniva.Modelo.ProdutDTO;

public interface ProductRepositorio extends MongoRepository<ProdutDTO,String> {
    
    
}
