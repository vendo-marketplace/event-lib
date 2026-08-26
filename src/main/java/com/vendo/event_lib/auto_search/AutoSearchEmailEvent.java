package com.vendo.event_lib.auto_search;

public record AutoSearchEmailEvent(String id, String email) {

    public static AutoSearchEmailEvent from(String id, String email) {
        return new AutoSearchEmailEvent(id, email);
    }

}
