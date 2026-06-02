package com.vendo.event_lib.favorite;

import java.time.Instant;
import java.util.UUID;

public record FavoriteAddedEvent(
        String eventId,
        String userId,
        String productId,
        Instant createdAt
) {

    public static FavoriteAddedEvent of(String userId, String productId) {
        return new FavoriteAddedEvent(
                UUID.randomUUID().toString(),
                userId,
                productId,
                Instant.now()
        );
    }
}