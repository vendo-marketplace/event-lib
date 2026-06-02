package com.vendo.event_lib.favorite;

import java.time.Instant;
import java.util.UUID;

public record FavoriteRemovedEvent(
        String eventId,
        String userId,
        String productId,
        Instant removedAt
) {

    public static FavoriteRemovedEvent of(String userId, String productId) {
        return new FavoriteRemovedEvent(
                UUID.randomUUID().toString(),
                userId,
                productId,
                Instant.now()
        );
    }
}