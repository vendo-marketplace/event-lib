package com.vendo.event_lib.product;

import java.math.BigDecimal;
import java.util.List;

public record ProductUpdatedEvent(
        String id,
        String title,
        String description,
        Integer quantity,
        BigDecimal price,
        String categoryId,
        List<AttributeEvent> attributes,
        Boolean active
) {

    public ProductUpdatedEvent(ProductUpdatedEvent.Builder builder) {
        this(builder.id, builder.title, builder.description, builder.quantity, builder.price, builder.categoryId, builder.attributes, builder.active);
    }

    public ProductUpdatedEvent.Builder builder() {
        return new ProductUpdatedEvent.Builder();
    }

    public static class Builder {
        private String id;
        private String title;
        private String description;
        private Integer quantity;
        private BigDecimal price;
        private String categoryId;
        private List<AttributeEvent> attributes;
        private Boolean active;

        public ProductUpdatedEvent.Builder id(String id) {
            this.id = id;
            return this;
        }

        public ProductUpdatedEvent.Builder title(String title) {
            this.title = title;
            return this;
        }

        public ProductUpdatedEvent.Builder description(String description) {
            this.description = description;
            return this;
        }

        public ProductUpdatedEvent.Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        public ProductUpdatedEvent.Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public ProductUpdatedEvent.Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public ProductUpdatedEvent.Builder attributes(List<AttributeEvent> attributes) {
            this.attributes = attributes;
            return this;
        }

        public ProductUpdatedEvent.Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        public ProductUpdatedEvent build() {
            return new ProductUpdatedEvent(this);
        }
    }
}
