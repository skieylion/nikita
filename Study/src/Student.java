public class Student {
    String name;
    int age;
    String major;
    String grades;

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setMajor(String major) {

        this.major = major;
    }

    public void setGrades(String grades) {

        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String getGrades() {
        return grades;
    }

    public static void fillStudentData(Student object, String name, int age, String major, String grades) {
        object.setName(name);
        object.setAge(age);
        object.setMajor(major);
        object.setGrades(grades);
    }
}
