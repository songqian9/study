package demo;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student(1,"王大雄","男",22,"计科1605");
        Student student2 = new Student(2,"张三","女",22,"计科1606");
        Student student3 = new Student(3,"李四","男",22,"计科1606");
        Student student4 = new Student(4,"王五","女",22,"计科1605");
        Student student5 = new Student(5,"赵六","男",22,"计科1606");

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);



    }


}
