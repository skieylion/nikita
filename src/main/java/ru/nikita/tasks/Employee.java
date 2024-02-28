package ru.nikita.tasks;

public class Employee extends Person {

    int experience;

    String profession;

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void employee() {
        System.out.println(" " + getExperience() + " " + getProfession());
    }

}
