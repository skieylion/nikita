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

    public String withFirstSymbpolAsUpper(String name){
        name = name.toLowerCase();
        name = name.substring(0,1).toUpperCase() + name.substring(1);

        return name;
    }

}
