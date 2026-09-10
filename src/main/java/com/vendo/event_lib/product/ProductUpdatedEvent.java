package com.vendo.event_lib.product;

import com.vendo.event_lib.product.nested.AddressEvent;
import com.vendo.event_lib.product.nested.AttributeEvent;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

@Builder
public record ProductUpdatedEvent(
        String id,

        String title,
        String description,
        Integer quantity,
        BigDecimal price,
        String categoryId,
        List<AttributeEvent> attributes,
        List<String> imageKeys,
        AddressEvent address,

        Boolean isNew,
        Boolean active
) {
}
