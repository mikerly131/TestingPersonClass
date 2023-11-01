package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {


    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Integer expectedHeight = 0;
        String expectedSSN = "NNN-NN-NNNN";
        String expectedEyeColor = "";
        String expectedBirthState = "";
        Boolean expectedAlive = true;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Integer actualHeight = person.getHeight();
        String actualSSN = person.getSSN();
        String actualEyeColor = person.getEyeColor();
        String actualBirthState = person.getBirthState();
        Boolean actualAlive = person.getAliveStatus();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedSSN, actualSSN);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedBirthState, actualBirthState);
        Assert.assertEquals(expectedAlive, actualAlive);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 178;

        // When
        person.setHeight(expected);

        // Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetSSN() {
        // Given
        Person person = new Person();
        String expected = "NNN-NN-NNNN";

        // When
        person.setSSN(expected);

        // Then
        String actual = person.getSSN();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthState() {
        // Given
        Person person = new Person();
        String expected = "";

        // When
        person.setBirthState(expected);

        // Then
        String actual = person.getBirthState();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAliveStatus() {
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        person.setAliveStatus(expected);

        // Then
        Boolean actual = person.getAliveStatus();
        Assert.assertEquals(expected, actual);
    }

}
