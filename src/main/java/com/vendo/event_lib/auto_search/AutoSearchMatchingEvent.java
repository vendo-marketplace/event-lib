package com.vendo.event_lib.auto_search;

public record AutoSearchMatchingEvent(String id) {

    public static AutoSearchMatchingEvent from(String id) {
        return new AutoSearchMatchingEvent(id);
    }

}
