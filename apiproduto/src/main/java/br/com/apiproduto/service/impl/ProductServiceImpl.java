package br.com.apiproduto.service.impl;

import br.com.apiproduto.entity.Product;
import br.com.apiproduto.repository.ProductRepository;
import br.com.apiproduto.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> listAllProduct() {
        return repository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            throw  new RuntimeException("trouble deleting product");
        }
    }
}
