package ru.nikita.tasks;

import static java.awt.AWTEventMulticaster.add;

public class App {
    public static void main(String[] args) {

        Client client = new Client();
        Employee employee = new Employee();

        client.setName("Никита");
        employee.setName("Женя");
        client.setSecondName("Иванников");
        employee.setSecondName("Иванников");
        client.setScore(4.5f);
        employee.setProfession("Программист");
        client.setAge(19);
        client.setRequest("Хочу программировать");
        employee.setExperience(5);

        System.out.println(client.client());
        System.out.println(employee.employee());






        int n = 4;
        Animal[] animals = new Animal[n];
        for (int i = 0; i < n; i++) {
            animals[i] = i % 2 == 0? new Cow() : new Cat();
            animals[i].test();
        }

        Venicle venicle = new Car();

        venicle.display();

        PersonA personA = new PersonA("Jenya", 30);

        System.out.println(personA.toString());

    }
}



