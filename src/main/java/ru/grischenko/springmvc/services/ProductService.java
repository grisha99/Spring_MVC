package ru.grischenko.springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.grischenko.springmvc.inter.ProductRepository;
import ru.grischenko.springmvc.models.Product;
import ru.grischenko.springmvc.repositories.ProductsMemRepository;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class ProductService {

    ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.getAllProducts();
    }

    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    public void addNewProduct(Product product) {
        productRepository.addNewProduct(product);
    }

}
