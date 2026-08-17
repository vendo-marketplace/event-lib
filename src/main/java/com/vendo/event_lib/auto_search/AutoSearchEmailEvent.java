package com.vendo.event_lib.auto_search;

import java.math.BigDecimal;
import java.util.List;

public record AutoSearchEmailEvent(
        String id,
        String email,
        List<ResultProduct> products
) {
    public record ResultProduct(
            String id,
            String title,
            BigDecimal price
    ) {
    }

}
