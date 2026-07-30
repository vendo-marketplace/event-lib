package com.vendo.event_lib.product.nested;

public record AddressEvent(
        String region,
        String city,
        Location location
) {

    public record Location(
            double lat,
            double lon
    ) {}

}
