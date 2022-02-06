package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private Radio radio = new Radio(20);

// TEST1: DECREASE CURRENT RADIO STATION
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 19", "above min value per 1 | 1 | 0",
            "max value | 19 | 18", "below max value per 1 | 18 | 17",
            "in middle area of values | 5 | 4"}, delimiter = '|')

    /* min value | above min value per 1 (+ 1)
    * max value | below max value per 1 (- 1)
    * in middle area of values */

    public void shouldDecreaseCurrentRadioStation(String testName, int currentRadioStation, int expected) {
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

// TEST2: INCREASE CURRENT RADIO STATION
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 1", "above min value per 1 | 1 | 2",
            "max value | 19 | 0", "below max value per 1 | 18 | 19",
            "in middle area of values | 14 | 15"}, delimiter = '|')

    /* min value | above min value per 1 (+ 1)
    * max value | below max value per 1 (- 1)
    * in middle area of values */
    public void shouldIncreaseCurrentRadioStation(String testName, int currentRadioStation, int expected) {
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

// TEST3: DECREASE CURRENT VOLUME
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 0", "above min value per 1 | 1 | 0",
            "max value | 100 | 99", "below max value per 1 | 99 | 98",
            "in middle area of values | 63 | 62"}, delimiter = '|')

    /* min value | above min value per 1 (+ 1)
    * max value | below max value per 1 (- 1)
    * in middle area of values */
    public void shouldDecreaseCurrentVolume(String testName, int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.prevVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

// TEST4: INCREASE CURRENT VOLUME
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 1", "above min value per 1 | 1 | 2",
            "max value | 100 | 100", "below max value per 1 | 99 | 100",
            "in middle area of values | 8 | 9"}, delimiter = '|')

    /* min value | above min value per 1 (+ 1)
    * max value | below max value per 1 (- 1)
    * in middle area of values */
    public void shouldIncreaseCurrentVolume(String testName, int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.nextVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

// TEST6: SET CURRENT RADIO STATION
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 0", "above min value per 1 | 1 | 1",
            "max value | 10 | 10", "below max value per 1 | 9 | 9",
            "in middle area of values | 7 | 7"}, delimiter = '|')

    /* min value | above min value per 1 (- 1)
    * max value | below max value per 1 (+ 1)
    * in middle area of values*/
    public void shouldSetCurrentRadioStation(String testName, int currentRadioStation, int expected) {
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(expected, radio.getCurrentRadioStation());
    }

// TEST7: NOT SET CURRENT RADIO STATION
    @ParameterizedTest
    @CsvSource(value = {"below min value per 1 | -1 | 0",
            "above max value per 1 | 20 | 0",
            "some number not in the boards of values | -123 | 0"}, delimiter = '|')

    /* below min value per 1 (- 1)
    * above max value per 1 (+ 1)
    * some number not in the boards of values*/
    public void shouldNotSetCurrentRadioStation(String testName, int currentRadioStation, int expected) {
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(expected, radio.getCurrentRadioStation());
    }

// TEST8: SET CURRENT VOLUME
    @ParameterizedTest
    @CsvSource(value = {"min value | 0 | 0", "above min value per 1 | 1 | 1",
            "max value | 100 | 100", "below max value per 1 | 99 | 99",
            "in middle area of values | 37 | 37"}, delimiter = '|')

    /* min value | above min value per 1 (- 1)
    * max value | below max value per 1 (+ 1)
    * in middle area of values*/
    public void shouldSetCurrentVolume(String testName, int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

// TEST9: NOT SET CURRENT VOLUME
    @ParameterizedTest
    @CsvSource(value = {"below min value per 1 | -1 | 0",
            "above max value per 1 | 101 | 0",
            "some number not in the boards of values | 342 | 0"}, delimiter = '|')

    /* below min value per 1 (- 1)
    * above max value per 1 (+ 1)
    * some number not in the boards of values*/
    public void shouldNotSetCurrentVolume(String testName, int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }
}