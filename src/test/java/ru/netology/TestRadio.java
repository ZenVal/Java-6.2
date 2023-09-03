package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {
    Radio radio = new Radio();

    // Тесты setCurrentStation
    @Test
    public void setCurrentStationZero() {

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStationFive() {
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStationNine() {
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void cantSetCurrentStationSubzero() {
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void cantSetCurrentStationTen() {
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // Тесты setNextStation и  setPrevStation
    @Test
    public void setNextStationShouldOne() {
        radio.setNextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextStationShouldZero() {
        radio.setCurrentStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPrevStationShouldZero() {
        radio.setCurrentStation(1);
        radio.setPrevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPrevStationShouldNine() {
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // Тесты настройки звука increaseVolume
    @Test
    public void increaseVolumeShouldOne() {
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeShouldFifty() {
        for (int i = 0; i < 50; i++) {
            radio.increaseVolume();
        }
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
   }
   @Test
    public void increaseVolumeShouldOneHundred() {
       for (int i = 0; i < 101; i++) {
           radio.increaseVolume();
       }
       int expected = 100;
       int actual = radio.getCurrentVolume();

       Assertions.assertEquals(expected, actual);
   }
    @Test
    public void increaseVolumeShouldOneHundredAnyway() {
        for (int i = 0; i < 110; i++) {
            radio.increaseVolume();
        }
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // Тест настройки звука decreaseVolume
    @Test
    public void dereaseVolumeShouldZero() {
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void dereaseVolumeShouldTen() {
        for (int i = 0; i < 11; i++) {
            radio.increaseVolume();
        }
        radio.decreaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
