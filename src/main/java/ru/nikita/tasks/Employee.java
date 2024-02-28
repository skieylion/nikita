package ru.nikita.tasks;

public class Employee extends Person {

    int experience;

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void employee() {
        System.out.println(" " + getExperience());
    }

}
