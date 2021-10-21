package com.example.ppkwuzadanie2;

public class StringData {
    private final String text;
    private Integer digits = 0;
    private Integer upperCase = 0;
    private Integer lowerCase = 0;
    private Integer whitespace = 0;
    private Integer specialCharacters = 0;

    public StringData(String text) {
        this.text = text;

        for (int i = 0; i < text.length(); i++) {
            char c = this.text.charAt(i);

            if (Character.isDigit(c)) {
                this.digits++;
            } else if (Character.isUpperCase(c)) {
                this.upperCase++;
            } else if (Character.isLowerCase(c)) {
                this.lowerCase++;
            } else if (Character.isWhitespace(c)) {
                this.whitespace++;
            } else {
                this.specialCharacters++;
            }
        }
    }

    public String getText() {
        return text;
    }

    public Integer getDigits() {
        return digits;
    }

    public Integer getUpperCase() {
        return upperCase;
    }

    public Integer getLowerCase() {
        return lowerCase;
    }

    public Integer getWhitespace() {
        return whitespace;
    }

    public Integer getSpecialCharacters() {
        return specialCharacters;
    }
}
