package com.vendo.event_lib.auto_search;

public record AutoSearchMatchingEvent(String id, String email) {

    public static AutoSearchMatchingEvent from(String id, String email) {
        return new AutoSearchMatchingEvent(id, email);
    }

}
