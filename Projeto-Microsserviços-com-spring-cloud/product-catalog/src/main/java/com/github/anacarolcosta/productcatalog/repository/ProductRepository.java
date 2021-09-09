package com.github.anacarolcosta.productcatalog.repository;


import com.github.anacarolcosta.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
