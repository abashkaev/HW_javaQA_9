package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void settUpStation() {
        Radio rad = new Radio(10);
        rad.setSelectStation(3);
        rad.nextStation();
        int expected = 4;
        int actual = rad.getSelectStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousStation() {
        Radio rad = new Radio(10);
        rad.setSelectStation(5);
        rad.previousStation();
        int expected = 4;
        int actual = rad.getSelectStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settPreviousStationUnderZero() {
        Radio rad = new Radio(10);

        rad.previousStation();
        int expected = 9;
        int actual = rad.getSelectStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settNextStationMoreNine() {
        Radio rad = new Radio();
        rad.setSelectStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getSelectStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settVolumeUp() {
        Radio rad = new Radio();
        rad.setVolume(98);
        rad.turnVolumeUp();

        int expected = 99;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settVolumeDown() {
        Radio rad = new Radio(1);

        rad.turnVolumeDown();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setVolume(100);
        rad.turnVolumeUp();

        int expected = 100;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settVolumeUnderMin() {
        Radio rad = new Radio(0);

        rad.turnVolumeDown();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeTotalStations() {
        Radio rad = new Radio(10);

        rad.setTotalStation(20);

        Assertions.assertEquals(20, rad.getTotalStation());
    }

    @Test
    public void setTotalStationUnderOne() {
        Radio rad = new Radio(10);
        rad.setTotalStation(0);

        Assertions.assertEquals(10, rad.getTotalStation());
    }

    @Test
    public void setSelectStationAboveTotalStation() {
        Radio rad = new Radio(10);
        rad.setSelectStation(5);
        rad.setSelectStation(15);

        Assertions.assertEquals(5, rad.getSelectStation());
    }
}


