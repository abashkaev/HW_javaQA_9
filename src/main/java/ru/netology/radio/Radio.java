package ru.netology.radio;

public class Radio {
    private int numberStation;

    private int volume;


    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            newNumberStation = 9;
        }
        if (newNumberStation > 9) {
            newNumberStation = 0;
        }
        numberStation = newNumberStation;
    }

    public void nextStation() {
        int changeNextStation = numberStation + 1;
        setNumberStation(changeNextStation);
    }

    public void previousStation() {
        int changePreviousStation = numberStation - 1;
        setNumberStation(changePreviousStation);
    }

    int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            newVolume = 0;
        }
        if (newVolume > 100) {
            newVolume = 100;
        }
        volume = newVolume;
    }

    public void turnVolumeUP() {
        int volumeUp = volume + 1;
        setVolume(volumeUp);
    }

    public void turnVolumeDown() {
        int volumeDown = volume - 1;
        setVolume(volumeDown);
    }
}
