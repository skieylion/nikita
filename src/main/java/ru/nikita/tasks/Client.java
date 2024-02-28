package ru.nikita.tasks;

public class Client extends Person{

    int age;

    String request;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getRequest() {
        return request;
    }

    public void client() {
        System.out.println(" " + getAge() + " " + getRequest());
    }

}
