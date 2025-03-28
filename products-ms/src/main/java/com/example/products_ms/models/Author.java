package com.example.products_ms.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;



@Data // This annotation is used to avoid declare  [getters and setters] functions
@Document(collection = "authors")
@NoArgsConstructor
public class Author {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    private String lastName;

    @Field(name="emails")
    private List<String> email;
    private String phone;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    public Author(String id, String name, String lastName, List<String> email, String phone, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Note: As use [Lombok] we don't need to use declared [getters and setters] functions.


}
