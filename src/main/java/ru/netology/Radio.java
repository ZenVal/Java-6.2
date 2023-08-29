package ru.netology;
public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
                    // Выбор радиостанции
    public void setCurrentStation(int stationNumber) {
        if (stationNumber < 0 | stationNumber > 9) {
            return;
        }
        currentStation = stationNumber;
    }
    public void setNextStation() {
        if (currentStation == 9) {
            currentStation = 0;
            return;
        }
        currentStation++;
    }
    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        currentStation--;
    }
                    // Регулировка звука
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
