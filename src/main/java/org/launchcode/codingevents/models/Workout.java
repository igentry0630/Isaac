package org.launchcode.codingevents.models;


public class Workout {

    private int id;
    private static int nextId = 1;

    @Size(min = 3, max = 30, message = "Workout must be between 3 and 50 characters")
    private String name;


    public Workout(String name) {
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
