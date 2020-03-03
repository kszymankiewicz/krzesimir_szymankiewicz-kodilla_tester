package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();


    @ParameterizedTest
    @ValueSource(strings  = {"aaa","aaaa","AaAa","AzAz","K.s-g_12"})
    public void IsProvidedUsernameValid(String input) {
        assertTrue( validator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa","%%%","   K"})
    public void IsProvidedUsernameInValid(String input) {
        assertFalse( validator.validateUsername(input));
    }
    @ParameterizedTest
    @ValueSource(strings = {"AzAz_09-b@AzAz_09-b.pl","jan.kowalski@gmail.com", "adam.@tak.tak.pl" })
    public void checkingCorrectnessOfEmailProvided (String input) {
        assertTrue( validator.validateEmail(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"adam jakis@o2.pl","adam.adam.adam.pl","@"})
    public void checkingIncorrectnessOfEmailProvided(String input) {
        assertFalse( validator.validateEmail(input));
    }
}

