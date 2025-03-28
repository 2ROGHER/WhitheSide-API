package com.example.products_ms.models;

import com.example.products_ms.models.enums.ProductStatus;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

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
    private Category[] category;
    private String[] versions;
    private String releasedAt;
    private ProductStatus status;
    private Language[] languages;
    private boolean prize;
    private String[] platforms;
    private String[] license;
    private float size;
    private String[] architecture;
    private String[] minimumRequirements;
    private Company company;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private String updatedAt;

    public Product(String id,
                   String name,
                   String description,
                   Category[] category,
                   String[] versions,
                   String releasedAt,
                   ProductStatus status,
                   Language[] languages,
                   boolean prize,
                   String[] platforms,
                   String[] license,
                   float size,
                   String[] architecture,
                   String[] minimumRequirements,
                   Company company,
                   LocalDateTime createdAt,
                   String updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.versions = versions;
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

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String[] getMinimumRequirements() {
        return minimumRequirements;
    }

    public void setMinimumRequirements(String[] minimumRequirements) {
        this.minimumRequirements = minimumRequirements;
    }

    public String[] getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String[] architecture) {
        this.architecture = architecture;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String[] getLicense() {
        return license;
    }

    public void setLicense(String[] license) {
        this.license = license;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    public boolean isPrize() {
        return prize;
    }

    public void setPrize(boolean prize) {
        this.prize = prize;
    }

    public Language[] getLanguages() {
        return languages;
    }

    public void setLanguages(Language[] languages) {
        this.languages = languages;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public String getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(String releasedAt) {
        this.releasedAt = releasedAt;
    }

    public String[] getVersions() {
        return versions;
    }

    public void setVersions(String[] versions) {
        this.versions = versions;
    }

    public Category[] getCategory() {
        return category;
    }

    public void setCategory(Category[] category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
