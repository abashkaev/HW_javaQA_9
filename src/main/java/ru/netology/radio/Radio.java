package ru.netology.radio;

public class Radio {
    private int selectStation = 0;
    private int totalStation = 10;

    private int volume = 0;

    public Radio(int volume) {
        this.volume = volume;
    }

    public Radio(int totalStation, int selectStation) {
        this.totalStation = totalStation;
        this.selectStation = selectStation;
    }

    public int getTotalStation() {
        return totalStation;
    }

    public void setTotalStation(int totalStation) {
        if (totalStation < 1) {
            return;
        }
        this.totalStation = totalStation;
    }

    public int getSelectStation() {
        return selectStation;
    }

    public void setSelectStation(int newSelectStation) {
        if (newSelectStation > totalStation) {
            return;
        }
        if (newSelectStation < 0) {
            newSelectStation = totalStation - 1;
        }
        if (newSelectStation >= totalStation) {
            newSelectStation = 0;
        }
        selectStation = newSelectStation;
    }

    public void nextStation() {
        int changeNextStation = selectStation + 1;
        setSelectStation(changeNextStation);
    }

    public void previousStation() {
        int changePreviousStation = selectStation - 1;
        setSelectStation(changePreviousStation);
    }

    int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void turnVolumeUp() {
        int volumeUp = volume + 1;
        setVolume(volumeUp);
    }

    public void turnVolumeDown() {
        int volumeDown = volume - 1;
        setVolume(volumeDown);
    }
}
