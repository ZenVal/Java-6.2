package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    // Тесты setCurrentStation
    @Test
    public void setCurrentStationZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStationFive() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStationNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void cantSetCurrentStationSubzero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void cantSetCurrentStationTen() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // Тесты setNextStation и  setPrevStation
    @Test
    public void setNextStationShouldOne() {
        Radio radio = new Radio();
        radio.setNextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextStationShouldZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPrevStationShouldZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setPrevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPrevStationShouldNine() {
        Radio radio = new Radio();
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // Тесты с конструктором вручную выставляющим максимальное колличество станций

    @Test
    public void setCurrentStationEleven() {
        Radio radio = new Radio(21);
        radio.setCurrentStation(11);

        int expected = 11;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStationTwenty() {
        Radio radio = new Radio(21);
        radio.setCurrentStation(20);

        int expected = 20;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStationZeroFromTwenty() {
        Radio radio = new Radio(21);
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextStationShouldZeroAfterTwenty() {
        Radio radio = new Radio(21);
        radio.setCurrentStation(20);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextStationShouldTwenty() {
        Radio radio = new Radio(21);
        radio.setCurrentStation(19);
        radio.setNextStation();

        int expected = 20;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextStationShouldFiftin() {
        Radio radio = new Radio(21);
        radio.setCurrentStation(14);
        radio.setNextStation();

        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPrevStationShouldZeroFromTwenty() {
        Radio radio = new Radio(21);
        radio.setCurrentStation(1);
        radio.setPrevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPrevStationShouldTwenty() {
        Radio radio = new Radio(21);
        radio.setCurrentStation(0);
        radio.setPrevStation();

        int expected = 20;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPrevStationShouldOne() {
        Radio radio = new Radio(21);
        radio.setCurrentStation(2);
        radio.setPrevStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }





    // Тесты настройки звука increaseVolume
    @Test
    public void increaseVolumeShouldOne() {
        Radio radio = new Radio();
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeShouldFifty() {
        Radio radio = new Radio();
        for (int i = 0; i < 50; i++) {
            radio.increaseVolume();
        }
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
   }
   @Test
    public void increaseVolumeShouldOneHundred() {
       Radio radio = new Radio();
       for (int i = 0; i < 101; i++) {
           radio.increaseVolume();
       }
       int expected = 100;
       int actual = radio.getCurrentVolume();

       Assertions.assertEquals(expected, actual);
   }
    @Test
    public void increaseVolumeShouldOneHundredAnyway() {
        Radio radio = new Radio();
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
        Radio radio = new Radio();
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void dereaseVolumeShouldTen() {
        Radio radio = new Radio();
        for (int i = 0; i < 11; i++) {
            radio.increaseVolume();
        }
        radio.decreaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
