package com.vendo.event_lib.product;

import java.util.List;

public record AttributeEvent(
        String id,
        String title,
        String type,
        List<String> values
) {
}
