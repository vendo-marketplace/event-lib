package com.vendo.event_lib.auto_search.nested;

import java.math.BigDecimal;
import java.util.List;

public record AutoSearchProductEvent(
        String id,
        String title,
        BigDecimal price,
        List<String> images
) {
}
