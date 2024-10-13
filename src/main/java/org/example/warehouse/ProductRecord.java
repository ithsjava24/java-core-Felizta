package org.example.warehouse;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductRecord(UUID uuid, String product, Category category, BigDecimal price) {

    public ProductRecord {
        if (product == null || product.isEmpty())
            throw new IllegalArgumentException("Product name can't be null or empty.");

        if (category == null)
            throw new IllegalArgumentException("Category can't be null.");

        if (uuid == null)
            uuid = UUID.randomUUID();

        if (price == null)
            price = BigDecimal.ZERO;
        }
    }
