package com.vendo.event_lib.auto_search;

import com.vendo.event_lib.auto_search.nested.AutoSearchProductEvent;

import java.util.List;

public record AutoSearchNewProductEvent(String id, String email, List<AutoSearchProductEvent> products) {

    public static AutoSearchNewProductEvent from(String id, String email, List<AutoSearchProductEvent> products) {
        return new AutoSearchNewProductEvent(id, email, products);
    }

}
