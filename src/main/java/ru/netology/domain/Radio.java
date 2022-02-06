package ru.netology.domain;

public class Radio {
    private int currentRadioStation; // add by user
    private int currentVolume; // add by user
    int quantityOfRadioStations = 10; // add by user
    int maxVolume = 100;
    int minVolume = 0; // value is default (0 for int)
    int minRadioStation = 0; // value is default (0 for int)
    // |max radio station| is |quantity of radio stations - 1|

    public Radio (int quantityOfRadioStations){
        this.quantityOfRadioStations = quantityOfRadioStations;
    }

    public Radio (){
    }

    // setter & getter for current radio station
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >= minRadioStation && currentRadioStation <= quantityOfRadioStations - 1) {
            this.currentRadioStation = currentRadioStation;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    // setter & getter for current volume
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= minVolume && currentVolume <= maxVolume) {
            this.currentVolume = currentVolume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // increase & decrease volume per 1
    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void prevVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    // increase & decrease radio station per 1
    public void nextRadioStation() {
        if (currentRadioStation < quantityOfRadioStations - 1) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = quantityOfRadioStations - 1;
        }
    }
}
