public class FillStudents {
    public static void fillStudentData(Student student, String name, int age, String major, String grades) {
        student.setName(student.toUpper(name));
        student.setAge(age);
        student.setMajor(major);
        student.setGrades(grades);

    }
}