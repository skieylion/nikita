public class FillStudent {
    public static void fillStudentData(Student student, String name, int age, String major, String grades) {
        student.setName(student.withFirstSymbpolAsUpper(name));
        student.setAge(age);
        student.setMajor(major);
        student.setGrades(grades);

    }
}