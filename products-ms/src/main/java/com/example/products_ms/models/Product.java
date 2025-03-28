package com.example.products_ms.models;

import com.example.products_ms.models.enums.ProductStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

/**
 * This class represents the [product] entity in our database with MongoDB
 * In this class we are letting the [setters and getters] with educational purposes. Because, we are using
 * [@Data]. This annotation avoids declare setters and getters.
 */
// We need to add the [audience] to track the flow.
@Data
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    // Adding [indexes] to the [Document]
    @Indexed(unique = true)
    private String name;
    private String description;
    private List<String> category;
    private String releasedAt;
    private ProductStatus status;
    private List<Language> languages;
    private boolean prize;
    private List<String> platforms;
    private List<String> license;
    private float size;
    private List<String> architecture;
    private List<String> minimumRequirements;
    private Company company;

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @CreatedDate
    private LocalDateTime createdAt;

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @LastModifiedDate
    private LocalDateTime updatedAt;

    public Product() {};

    public Product(String id,
                   String name,
                   String description,
                   List<String> category,
                   String releasedAt,
                   ProductStatus status,
                   List<Language> languages,
                   boolean prize,
                   List<String> platforms,
                   List<String> license,
                   float size,
                   List<String> architecture,
                   List<String> minimumRequirements,
                   Company company,
                   LocalDateTime createdAt,
                   LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.releasedAt = releasedAt;
        this.status = status;
        this.languages = languages;
        this.prize = prize;
        this.platforms = platforms;
        this.license = license;
        this.size = size;
        this.architecture = architecture;
        this.minimumRequirements = minimumRequirements;
        this.company = company;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public String getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(String releasedAt) {
        this.releasedAt = releasedAt;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public boolean isPrize() {
        return prize;
    }

    public void setPrize(boolean prize) {
        this.prize = prize;
    }

    public List<String> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<String> platforms) {
        this.platforms = platforms;
    }

    public List<String> getLicense() {
        return license;
    }

    public void setLicense(List<String> license) {
        this.license = license;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public List<String> getArchitecture() {
        return architecture;
    }

    public void setArchitecture(List<String> architecture) {
        this.architecture = architecture;
    }

    public List<String> getMinimumRequirements() {
        return minimumRequirements;
    }

    public void setMinimumRequirements(List<String> minimumRequirements) {
        this.minimumRequirements = minimumRequirements;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
