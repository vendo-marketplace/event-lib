package com.vendo.event_lib.product;

import java.util.List;

public record AttributeEvent(
        String title,
        String type,
        List<String> values
) {
}
