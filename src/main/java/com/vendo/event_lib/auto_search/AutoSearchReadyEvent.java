package com.vendo.event_lib.auto_search;

import com.vendo.event_lib.auto_search.nested.AutoSearchProductEvent;

import java.util.List;

public record AutoSearchReadyEvent(String id, String email, List<AutoSearchProductEvent> products) {

    public static AutoSearchReadyEvent from(String id, String email, List<AutoSearchProductEvent> products) {
        return new AutoSearchReadyEvent(id, email, products);
    }

}
