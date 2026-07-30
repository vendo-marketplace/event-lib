package com.vendo.event_lib.product;

import com.vendo.event_lib.product.nested.AddressEvent;
import com.vendo.event_lib.product.nested.AttributeEvent;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public record ProductCreatedEvent(
        String id,

        String title,
        String description,
        Integer quantity,
        BigDecimal price,
        List<AttributeEvent> attributes,
        List<String> imageKeys,
        AddressEvent address,

        Boolean isNew,
        Boolean active,

        String ownerId,
        String categoryId,

        Instant createdAt
) {

    public ProductCreatedEvent(Builder builder) {
        this(
                builder.id,
                builder.title,
                builder.description,
                builder.quantity,
                builder.price,
                builder.attributes,
                builder.imageKeys,
                builder.address,
                builder.active,
                builder.isNew,
                builder.ownerId,
                builder.categoryId,
                builder.createdAt
        );
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
        private List<AttributeEvent> attributes;
        private List<String> imageKeys;
        private AddressEvent address;

        private Boolean active;
        private Boolean isNew;

        private String ownerId;
        private String categoryId;

        private Instant createdAt;

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

        public Builder isNew(Boolean isNew) {
            this.isNew = isNew;
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

        public Builder attributes(List<AttributeEvent> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder imageKeys(List<String> imageKeys) {
            this.imageKeys = imageKeys;
            return this;
        }

        public Builder address(AddressEvent address) {
            this.address = address;
            return this;
        }

        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder createdAt(Instant createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public ProductCreatedEvent build() {
            return new ProductCreatedEvent(this);
        }
    }
}

