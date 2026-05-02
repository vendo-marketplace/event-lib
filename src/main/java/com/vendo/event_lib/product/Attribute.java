package com.vendo.event_lib.product;

import java.util.List;

public record Attribute(
        String title,
        String type,
        List<String> values
) {
}
