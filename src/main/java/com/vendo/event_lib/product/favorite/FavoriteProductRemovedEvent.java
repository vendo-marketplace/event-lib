package com.vendo.event_lib.product.favorite;

import java.time.Instant;

public record FavoriteProductRemovedEvent(
        String userId,
        String productId,
        Instant removedAt
) {

    public FavoriteProductRemovedEvent(Builder builder) {
        this(builder.userId, builder.productId, builder.removedAt);
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String userId;
        private String productId;
        private Instant removedAt;

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder removedAt(Instant removedAt) {
            this.removedAt = removedAt;
            return this;
        }

        public FavoriteProductRemovedEvent build() {
            return new FavoriteProductRemovedEvent(this);
        }
    }
}