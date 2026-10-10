package com.vendo.event_lib.auto_search;

public record AutoSearchReadyEvent(String id, String email) {

    public static AutoSearchReadyEvent from(String id, String email) {
        return new AutoSearchReadyEvent(id, email);
    }

}
