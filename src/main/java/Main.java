import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Ivan","Dubovskyi");
        Teacher teacher = new Teacher("Bogdan","Balych","None");
        List<University> university = new ArrayList<>();
        university.add(student);
        university.add(teacher);
        for (University u:university) {
            System.out.println(u.toString());
        }
    }
}
