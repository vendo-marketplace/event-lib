package com.vendo.event_lib.product.favorite;

import java.time.Instant;

public record FavoriteProductAddedEvent(
        String userId,
        String productId,
        Instant createdAt
) {

    public FavoriteProductAddedEvent(Builder builder) {
        this(builder.userId, builder.productId, builder.createdAt);
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String userId;
        private String productId;
        private Instant createdAt;

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder createdAt(Instant createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public FavoriteProductAddedEvent build() {
            return new FavoriteProductAddedEvent(this);
        }
    }
}