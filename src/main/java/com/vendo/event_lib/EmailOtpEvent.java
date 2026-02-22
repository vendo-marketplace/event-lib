package com.vendo.event_lib;

import java.util.Objects;

public class EmailOtpEvent {

    private String otp;

    private String email;

    private OtpEventType otpEventType;

    public EmailOtpEvent() {
    }

    public EmailOtpEvent(String otp, String email, OtpEventType otpEventType) {
        this.otp = otp;
        this.email = email;
        this.otpEventType = otpEventType;
    }

    public String getOtp() {
        return otp;
    }

    public String getEmail() {
        return email;
    }

    public OtpEventType getOtpEventType() {
        return otpEventType;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOtpEventType(OtpEventType otpEventType) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailOtpEvent that = (EmailOtpEvent) o;
        return Objects.equals(otp, that.otp) &&
                Objects.equals(email, that.email) &&
                otpEventType == that.otpEventType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(otp, email, otpEventType);
    }

    @Override
    public String toString() {
        return "EmailOtpEvent{" +
                "otp='" + otp + '\'' +
                ", email='" + email + '\'' +
                ", otpEventType=" + otpEventType +
                '}';
    }

    public enum OtpEventType {

        EMAIL_VERIFICATION,

        PASSWORD_RECOVERY

    }
}