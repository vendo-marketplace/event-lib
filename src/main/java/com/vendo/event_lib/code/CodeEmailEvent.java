package com.vendo.event_lib.code;

import lombok.Builder;

@Builder
public record CodeEmailEvent(
        String code,
        String email,
        CodeEventType type
) {
}