package com.example.products_ms.repositories;

import com.example.products_ms.models.Product;
import com.example.products_ms.models.enums.ProductStatus;

import java.util.List;

/**
 * This repository contains all [custom operations] to be performed in the collections at MongoDB.
 */
public interface IProductsRepository {
    List<Product>  findAllProductsById(String id);
    List<Product> findAllProductsByFilterTerm(String t);

    List<Product> findAllProductsByStatus(ProductStatus s);

    Product updateProduct(String id, Product p);
    Product deleteProduct(String id);
}
