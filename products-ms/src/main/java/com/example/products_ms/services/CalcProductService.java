package com.example.products_ms.services;

import com.mongodb.client.MongoCollection;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;

import java.util.Map;

public class CalcProductService {
    private final MongoTemplate mgTemplate;

    public CalcProductService(MongoTemplate mgTemplate) {
        this.mgTemplate = mgTemplate;
    }

    // Calculate the price average
    public  double getPriceAverage() {
        Aggregation ag = Aggregation.newAggregation(
                Aggregation.group().avg("price").as("averagePrice")
        );

        MongoCollection<Object> mongoTemplate;
        AggregationResults<Map> result = mgTemplate.aggregate(ag, "products", Map.class);
        return (double) result.getUniqueMappedResult().get("averagePrice");
    }
}
