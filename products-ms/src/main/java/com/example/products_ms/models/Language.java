package com.example.products_ms.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Document(collection = "languages")
@NoArgsConstructor
@AllArgsConstructor
public class Language {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    private String version;
    private List<String> organization;
    private String license;


}
