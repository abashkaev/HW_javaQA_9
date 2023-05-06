package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void settUpStation() {
        Radio rad = new Radio();

        rad.setNumberStation(3);
        rad.nextStation();
        int expected = 4;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settPreviousStation() {
        Radio rad = new Radio();

        rad.setNumberStation(5);
        rad.previousStation();
        int expected = 4;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settPreviousStationUnderZero() {
        Radio rad = new Radio();

        rad.setNumberStation(0);
        rad.previousStation();
        int expected = 9;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settNextStationMoreNine() {
        Radio rad = new Radio();

        rad.setNumberStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settVolumeUp() {
        Radio rad = new Radio();

        rad.setVolume(98);
        rad.turnVolumeUP();

        int expected = 99;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settVolumeDown() {
        Radio rad = new Radio();

        rad.setVolume(1);
        rad.turnVolumeDown();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setVolume(100);
        rad.turnVolumeUP();

        int expected = 100;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settVolumeUnderMin() {
        Radio rad = new Radio();

        rad.setVolume(0);
        rad.turnVolumeDown();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}


