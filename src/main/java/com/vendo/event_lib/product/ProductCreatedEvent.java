package com.vendo.event_lib.product;

import java.math.BigDecimal;
import java.util.List;

public record ProductCreatedEvent(
        String id,
        String title,
        String description,
        Integer quantity,
        BigDecimal price,
        String ownerId,
        String categoryId,
        List<Attribute> attributes,
        Boolean active
) {

    public ProductCreatedEvent(Builder builder) {
        this(builder.id, builder.title, builder.description, builder.quantity, builder.price, builder.ownerId, builder.categoryId, builder.attributes, builder.active);
    }

    public record Attribute(
            String title,
            String type,
            List<String> values
    ) {
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;
        private String title;
        private String description;
        private Integer quantity;
        private BigDecimal price;
        private String ownerId;
        private String categoryId;
        private List<Attribute> attributes;
        private Boolean active;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder attributes(List<Attribute> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        public ProductCreatedEvent build() {
            return new ProductCreatedEvent(this);
        }
    }
}

