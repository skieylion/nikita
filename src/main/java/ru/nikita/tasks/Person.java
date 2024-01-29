package ru.nikita.tasks;

public class Person {
    String name;

    int age;

    String profession;

    int experience;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void getFullName() {
        System.out.println(getName() + " " + getAge() + getProfession() + getExperience());
    }

}
