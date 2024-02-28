package ru.nikita.tasks;

public class Person {

    String name;
    String secondName;
    String profession;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void getFullName () {
        System.out.print(getName() + " " + getSecondName() + " " + getProfession());
    }

}
