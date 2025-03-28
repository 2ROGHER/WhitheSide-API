package com.example.products_ms.repositories;

import com.example.products_ms.models.Product;
import com.example.products_ms.models.enums.ProductStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


/**
 * Here define all CRUD operations to be executed when we connect to mongodb.
 * CRUD operations here.
 * Note: This interface methods should be follows conventions with MongoDB such as *findBy*, *deleteBy*, etc.
 */
public interface ProductsRepository extends MongoRepository<Product, String> {
    @Query(value="{}", fields = "{'name': 1, 'price': 1}")
    List<Product> findAllProducts();
    List<Product> findAllProductsById(String id);

    Product insert(Product p);
}
