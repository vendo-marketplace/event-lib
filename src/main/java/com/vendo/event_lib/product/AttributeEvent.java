package com.vendo.event_lib.product;

import java.util.List;

public record AttributeEvent(
        String id,
        List<String> values
) {
}
