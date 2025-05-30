package bai_19_string_amp_regex.bai_tap_2.controller;

import bai_19_string_amp_regex.bai_tap_2.model.PhoneNumberValidator;

public class PhoneNumberValidatorController {
    private PhoneNumberValidator validator = new PhoneNumberValidator();

    public boolean checkValidPhone(String phoneNumber) {
        return validator.isValid(phoneNumber);
    }
}

