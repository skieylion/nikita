package ru.nikita.tasks;

public class Client extends Person{

    float score;
    int age;

    String request;

    public void setAge(int age) {
        this.age = age;
    }
    public void setScore(float score) {
        this.score = score;
    }


    public float getScore() {
        return score;
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

    public String client() {
        return getFullName() + " " + getAge() + " " + getRequest() + " - " + getScore();
    }

}
