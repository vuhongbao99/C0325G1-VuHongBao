package bai_19_string_amp_regex.bai_tap_1.model;

public class ClassNameValidator {
    private static final String CLASS_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public boolean isValid(String className) {
        return className.matches(CLASS_REGEX);
    }
}

