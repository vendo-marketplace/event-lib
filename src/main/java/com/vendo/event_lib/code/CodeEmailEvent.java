package com.vendo.event_lib.code;

public record CodeEmailEvent(
        String code,
        String email,
        CodeEventType type
) {

    public CodeEmailEvent(String code, String email, CodeEventType type) {
        this.code = code;
        this.email = email;
        this.type = type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String code;
        private String email;
        private CodeEventType type;

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder type(CodeEventType type) {
            this.type = type;
            return this;
        }

        public CodeEmailEvent build() {
            return new CodeEmailEvent(code, email, type);
        }
    }
}