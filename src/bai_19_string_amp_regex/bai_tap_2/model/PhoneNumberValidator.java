package bai_19_string_amp_regex.bai_tap_2.model;

public class PhoneNumberValidator {
    private static final String PHONE_REGEX = "^\\(84\\)-\\(0\\d{9}\\)$";

    public boolean isValid(String phoneNumber) {
        return phoneNumber.matches(PHONE_REGEX);
    }
}

