package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private Radio radio = new Radio();

// TEST1: DECREASE CURRENT RADIO STATION
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 9", "above min value per 1 | 1 | 0",
            "max value | 9 | 8", "below max value per 1 | 8 | 7",
            "in middle area of values | 5 | 4"}, delimiter = '|')
    // min value | above min value per 1 (+ 1)
    // max value | below max value per 1 (- 1)
    // in middle area of values
    public void shouldDecreaseCurrentRadioStation(String testName, int currentRadioStation, int expected){
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals (expected, radio.prevRadioStation());
    }

// TEST2: INCREASE CURRENT RADIO STATION
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 1", "above min value per 1 | 1 | 2",
            "max value | 9 | 0", "below max value per 1 | 8 | 9",
            "in middle area of values | 4 | 5"}, delimiter = '|')
    // min value | above min value per 1 (+ 1)
    // max value | below max value per 1 (- 1)
    // in middle area of values
    public void shouldIncreaseCurrentRadioStation(String testName, int currentRadioStation, int expected){
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals (expected, radio.nextRadioStation());
    }

// TEST3: DECREASE CURRENT VOLUME
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 0", "above min value per 1 | 1 | 0",
            "max value | 10 | 9", "below max value per 1 | 9 | 8",
            "in middle area of values | 6 | 5"}, delimiter = '|')
    // min value | above min value per 1 (+ 1)
    // max value | below max value per 1 (- 1)
    // in middle area of values
    public void shouldDecreaseCurrentVolume(String testName, int currentVolume, int expected){
        radio.setCurrentVolume(currentVolume);
        assertEquals (expected, radio.prevVolume());
    }

// TEST4: INCREASE CURRENT VOLUME
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 1", "above min value per 1 | 1 | 2",
            "max value | 10 | 10", "below max value per 1 | 9 | 10",
            "in middle area of values | 8 | 9"}, delimiter = '|')
    // min value | above min value per 1 (+ 1)
    // max value | below max value per 1 (- 1)
    // in middle area of values
    public void shouldIncreaseCurrentVolume(String testName, int currentVolume, int expected){
        radio.setCurrentVolume(currentVolume);
        assertEquals (expected, radio.nextVolume());
    }

// TEST5: SET CURRENT RADIO STATION
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 0", "above min value per 1 | 1 | 1",
            "max value | 9 | 9", "below max value per 1 | 8 | 8",
            "in middle area of values | 7 | 7"}, delimiter = '|')

    // min value | above min value per 1 (- 1)
    // max value | below max value per 1 (+ 1)
    // in middle area of values
    public void shouldSetCurrentRadioStation(String testName, int currentRadioStation, int expected){
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals (expected, radio.getCurrentRadioStation());
    }

// TEST6: NOT SET CURRENT RADIO STATION
    @ParameterizedTest
    @CsvSource(value = {"below min value per 1 | -1 | 0",
            "above max value per 1 | 10 | 0",
            "some number not in the boards of values | -123 | 0"}, delimiter = '|')

    // below min value per 1 (- 1)
    // above max value per 1 (+ 1)
    // some number not in the boards of values
    public void shouldNotSetCurrentRadioStation(String testName, int currentRadioStation, int expected){
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals (expected, radio.getCurrentRadioStation());
    }

// TEST7: SET CURRENT VOLUME
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 0", "above min value per 1 | 1 | 1",
            "max value | 10 | 10", "below max value per 1 | 9 | 9",
            "in middle area of values | 3 | 3"}, delimiter = '|')

    // min value | above min value per 1 (- 1)
    // max value | below max value per 1 (+ 1)
    // in middle area of values
    public void shouldSetCurrentVolume(String testName, int currentVolume, int expected){
        radio.setCurrentVolume(currentVolume);
        assertEquals (expected, radio.getCurrentVolume());
    }

// TEST8: NOT SET CURRENT VOLUME
    @ParameterizedTest
    @CsvSource(value = {"below min value per 1 | -1 | 0",
            "above max value per 1 | 11 | 0",
            "some number not in the boards of values | 342 | 0"}, delimiter = '|')

    // below min value per 1 (- 1)
    // above max value per 1 (+ 1)
    // some number not in the boards of values
    public void shouldNotSetCurrentVolume(String testName, int currentVolume, int expected){
        radio.setCurrentVolume(currentVolume);
        assertEquals (expected, radio.getCurrentVolume());
    }
}