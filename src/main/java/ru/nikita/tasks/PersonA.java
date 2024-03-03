package ru.nikita.tasks;

public class PersonA {

    String name;
    int age;
    PersonA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona {" + "name = " + name + " , age = " + age + "}";
    }
}
