public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rahat Vai");
        student.setName("Female");
        System.out.println("Student name is:" + student.getName());
        System.out.println(student.getGender());
    }
}
