package com.vendo.event_lib;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailOtpEvent {

    private String otp;

    private String email;

    private OtpEventType otpEventType;

    public enum OtpEventType {

        EMAIL_VERIFICATION,

        PASSWORD_RECOVERY

    }
}