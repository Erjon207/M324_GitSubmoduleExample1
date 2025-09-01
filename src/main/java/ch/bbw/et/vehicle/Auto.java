package ch.bbw.et.vehicle;

import ch.bbw.et.person.Person;

public class Auto {

    private String name;
    private Person driver;

    public Auto(String name, Person driver) {
        this.name = name;
        this.driver = driver;
    }

    public Auto() {}

    public void drive() {
        System.out.println("Driving " + name + " from " + driver.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", driver=" + driver +
                '}';
    }
}
