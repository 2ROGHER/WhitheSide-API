package com.example.products_ms.repositories;

import com.example.products_ms.models.Product;
import com.example.products_ms.models.enums.ProductStatus;

import java.util.List;

public class ProductsRepositoryImpl implements IProductsRepository {
    @Override
    public List<Product> findAllProductsById(String id) {
        return List.of();
    }

    @Override
    public List<Product> findAllProductsByFilterTerm(String t) {
        return List.of();
    }

    @Override
    public List<Product> findAllProductsByStatus(ProductStatus s) {
        return List.of();
    }

    @Override
    public Product updateProduct(String id, Product p) {
        return null;
    }

    @Override
    public Product deleteProduct(String id) {
        return null;
    }
}
