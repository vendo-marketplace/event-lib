package com.vendo.event_lib.product;

public record ProductImageRequestedEvent(
        String key,
        String extension,
        long size
) {
}
