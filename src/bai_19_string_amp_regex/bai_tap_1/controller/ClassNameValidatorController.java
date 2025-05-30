package bai_19_string_amp_regex.bai_tap_1.controller;

import bai_19_string_amp_regex.bai_tap_1.model.ClassNameValidator;

public class ClassNameValidatorController {
    private ClassNameValidator validator = new ClassNameValidator();

    public boolean checkValidClassName(String className) {
        return validator.isValid(className);
    }
}

