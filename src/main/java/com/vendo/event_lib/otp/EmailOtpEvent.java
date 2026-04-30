package com.vendo.event_lib.otp;

public record EmailOtpEvent(
        String otp,
        String email,
        OtpEventType otpEventType
) {

    public EmailOtpEvent(String otp, String email, OtpEventType otpEventType) {
        this.otp = otp;
        this.email = email;
        this.otpEventType = otpEventType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String otp;
        private String email;
        private OtpEventType otpEventType;

        public Builder otp(String otp) {
            this.otp = otp;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder otpEventType(OtpEventType otpEventType) {
            this.otpEventType = otpEventType;
            return this;
        }

        public EmailOtpEvent build() {
            return new EmailOtpEvent(otp, email, otpEventType);
        }
    }
}