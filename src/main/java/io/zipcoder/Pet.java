package io.zipcoder;

public class Pet {
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
}
