package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(15);
        conditioner.increaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(16, conditioner.getCurrentTemperature());
    }

    @Test
    public void doNotIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(25, conditioner.getCurrentTemperature());
    }

    @Test
    public void returnMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(26);
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(14, conditioner.getCurrentTemperature());
    }

    @Test
    public void doNotDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(0);
        conditioner.decreaseCurrentTemperature();
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void returnMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(-1);
        System.out.println(conditioner.getCurrentTemperature());
        assertEquals(0, conditioner.getCurrentTemperature());
    }
}