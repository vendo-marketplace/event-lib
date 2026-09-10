package com.vendo.event_lib.product;

import com.vendo.event_lib.product.nested.AddressEvent;
import com.vendo.event_lib.product.nested.AttributeEvent;
import com.vendo.event_lib.product.nested.Owner;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Builder
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

        Owner owner,
        String categoryId,

        Instant createdAt
) {



}

