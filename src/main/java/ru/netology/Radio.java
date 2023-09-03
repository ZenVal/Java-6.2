package ru.netology;
public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;

    public Radio() {

    }
    public Radio(int stationsNumber) {
        maxStation = stationsNumber - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

                    // Выбор радиостанции
    public void setCurrentStation(int stationNumber) {
        if (stationNumber < 0 | stationNumber > maxStation) {
            return;
        }
        currentStation = stationNumber;
    }
    public void setNextStation() {
        if (currentStation == maxStation) {
            currentStation = 0;
            return;
        }
        currentStation++;
    }
    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
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
