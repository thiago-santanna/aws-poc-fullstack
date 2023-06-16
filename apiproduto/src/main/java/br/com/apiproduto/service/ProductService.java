package br.com.apiproduto.service;

import br.com.apiproduto.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAllProduct();
    Product saveProduct(Product product);
    void delete(Long id);
}
