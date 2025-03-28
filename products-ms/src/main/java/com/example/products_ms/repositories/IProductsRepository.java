package com.example.products_ms.repositories;

import com.example.products_ms.models.Product;
import com.example.products_ms.models.enums.ProductStatus;

import java.util.List;

/**
 * This repository contains some custom methods to perform some operations at database MongoDB.
 */
public interface IProductsRepository {
    List<Product>  findAllProductsById(String id);
    List<Product> findAllProductsByFilterTerm(String t);

    List<Product> findAllProductsByStatus(ProductStatus s);

    Product updateProduct(String id, Product p);
    Product deleteProduct(String id);
}
