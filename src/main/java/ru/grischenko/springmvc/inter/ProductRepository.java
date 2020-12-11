package ru.grischenko.springmvc.inter;

import ru.grischenko.springmvc.models.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts();

    Product getProductById(int id);

    void addNewProduct(Product product);
}
