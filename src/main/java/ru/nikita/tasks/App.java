package ru.nikita.tasks;

import static java.awt.AWTEventMulticaster.add;

public class App {
    public static void main(String[] args) {

        Client client = new Client();
        Employee employee = new Employee();

        client.setName("Никита");
        employee.setName("Женя");
        client.setSecondName("вфыв");
        employee.setSecondName("вфыв");
        client.setProfession("Студет");
        employee.setProfession("Программист");
        client.setAge(19);
        client.setRequest("Хочу программировать");
        employee.setExperience(5);

        client.getFullName();
        client.client();
        employee.getFullName();
        employee.employee();

    }
}



