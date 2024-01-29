package ru.nikita.tasks;

import static java.awt.AWTEventMulticaster.add;

public class App {
    public static void main(String[] args) {

        Client client = new Client();

        client.setAge(16);
        client.setName("Ваня");
        client.setProfession(" -- ");
        client.getFullName();

        Employee employee = new Employee();

        employee.setAge(25);
        employee.setName("Александр");
        employee.setProfession(" Официант ");
        employee.setExperience(3);
        employee.getFullName();

    }

}
