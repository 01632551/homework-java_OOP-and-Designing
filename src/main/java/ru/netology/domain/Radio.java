package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    int maxVolume = 10;
    int minVolume = 0;
    int maxRadioStation = 9;
    int minRadioStation = 0;

    // setter for current radio station
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >= minRadioStation && currentRadioStation <= maxRadioStation) {
            this.currentRadioStation = currentRadioStation;
        }
    }

    // getter for current radio station
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    // setter for current volume
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= minVolume && currentVolume <= maxVolume) {
            this.currentVolume = currentVolume;
        }
    }

    // getter for current volume
    public int getCurrentVolume() {
        return currentVolume;
    }


    // increase volume per 1
    public int nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return currentVolume;
    }

    // decrease volume per 1
    public int prevVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        return currentVolume;
    }

    // increase radio station per 1
    public int nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
        return currentRadioStation;
    }

    // decrease radio station per 1
    public int prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
        return currentRadioStation;
    }
}
