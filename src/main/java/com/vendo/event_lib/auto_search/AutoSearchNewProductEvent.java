package com.vendo.event_lib.auto_search;

public record AutoSearchNewProductEvent(String id, String email) {

    public static AutoSearchNewProductEvent from(String id, String email) {
        return new AutoSearchNewProductEvent(id, email);
    }

}
