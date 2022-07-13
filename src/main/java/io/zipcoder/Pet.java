package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Pet implements Comparable<Pet> {
    String name;

    public Pet(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String speak() {
        return "Gibberish";
    }
    public String toString() {
        return "\n" + name + " says " + speak();
    }

    public static Pet[] sortPetsByTypeThenName(Pet[] petArr) {
        Comparator<Pet> bySubclass = (o1, o2) -> {
            int compare = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
            if (compare == 0) return o1.getName().compareTo(o2.getName());
            return compare;
        };
        List<Pet> petList = new ArrayList<>(Arrays.asList(petArr));
        petList.sort(bySubclass);
        return petList.toArray(new Pet[0]);
    }

    @Override
    public int compareTo(Pet o) {
        int compare = this.getName().compareTo(o.getName());
        if (compare == 0) return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
        return compare;
    }
}
