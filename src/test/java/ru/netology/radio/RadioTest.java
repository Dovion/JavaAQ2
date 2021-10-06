package ru.netology.radio;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    public Radio radio = new Radio();

    @Test
    void setCurrentStation() {

        radio.setStation(5);
        int actual = radio.getStation();
        int expected = 5; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationHigh() {

        radio.setStation(99);
        int actual = radio.getStation();
        int expected = 9; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationLow() {

        radio.setStation(0);
        int actual = radio.getStation();
        int expected = 0; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStation() {

        radio.setStation(5);
        radio.increaseStation();
        int actual = radio.getStation();
        int expected = 6; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStationHigh() {

        radio.setStation(99);
        radio.increaseStation();
        int actual = radio.getStation();
        int expected = 0; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStationLow() {

        radio.setStation(0);
        radio.increaseStation();
        int actual = radio.getStation();
        int expected = 1; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStation() {

        radio.setStation(5);
        radio.decreaseStation();
        int actual = radio.getStation();
        int expected = 4; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStationHigh() {

        radio.setStation(99);
        radio.decreaseStation();
        int actual = radio.getStation();
        int expected = 8; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStationLow() {

        radio.setStation(0);
        radio.decreaseStation();
        int actual = radio.getStation();
        int expected = 9; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolume() {

        radio.setVolume(5);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 6; //Ожидаемое значение громкости после нажатия кнопки +
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeHigh() {

        radio.setVolume(99);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 10; //Ожидаемое значение громкости после нажатия кнопки +
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeLow() {

        radio.setVolume(0);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 1; //Ожидаемое значение громкости после нажатия кнопки +
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseVolume() {

        radio.setVolume(5);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 4; //Ожидаемое значение громкости после нажатия кнопки -
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseVolumeHigh() {

        radio.setVolume(99);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 9; //Ожидаемое значение громкости после нажатия кнопки -
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseVolumeLow() {

        radio.setVolume(0);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 0; //Ожидаемое значение громкости после нажатия кнопки -
        assertEquals(expected, actual);
    }

}