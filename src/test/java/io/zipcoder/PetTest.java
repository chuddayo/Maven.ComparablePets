package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PetTest {

    @Test
    public void sortPetsByTypeThenNameTest() {
        Cat cat0 = new Cat("Zaney");
        Dog dog1 = new Dog("Harry");
        Cat cat1 = new Cat("Harry");
        Pet[] myPetList = new Pet[]{cat0, dog1, cat1};
        Pet[] expected = new Pet[]{cat1, cat0, dog1};

        Pet[] actual = Pet.sortPetsByTypeThenName(myPetList);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void compareToTest() {
        Cat cat0 = new Cat("Zaney");
        Dog dog1 = new Dog("Harry");
        Cat cat1 = new Cat("Harry");
        Assert.assertTrue(cat1.compareTo(dog1) < 0);
        Assert.assertTrue(dog1.compareTo(cat0) < 0);
    }
}
