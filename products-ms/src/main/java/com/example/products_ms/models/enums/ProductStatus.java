package com.example.products_ms.models.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.STRING)
public enum ProductStatus {
    DEFAULT,
    ALPHA,
    BETA,
    DEPRECATED,
    DISCONTINUED,
    RELEASED,
    STABLE,
    ACTIVE,
    MAINTAINED,
    EOL,
    ABANDOWARE,
    FORKED
}
