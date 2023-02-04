import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args)
    {
        List<Student> studentList  = new ArrayList<>();
        studentList.add(new Student(4,"Khiwani", 1));
        studentList.add(new Student(3,"Pritika", 10));
        studentList.add(new Student(1,"Sonal", 38));
        studentList.add(new Student(7,"Shilpi", 36));
        studentList.add(new Student(8,"Siddhartha", 30));
        System.out.println("Sorting using Comparable");
        Collections.sort(studentList);
        for(Student student: studentList)
        {
            System.out.println("RollNo : "+student.getRollNo()+" Student Name : "+student.getStudentName() + " age : "+student.getAge());
        }
        System.out.println("Sorting using Age Comparator");
        Collections.sort(studentList,new AgeComparator());
        for(Student student: studentList)
        {
            System.out.println("RollNo : "+student.getRollNo()+" Student Name : "+student.getStudentName() + " age : "+student.getAge());
        }
        System.out.println("Sorting using Name Comparator");
        Collections.sort(studentList,new NameComparator());
        for(Student student: studentList)
        {
            System.out.println("RollNo : "+student.getRollNo()+" Student Name : "+student.getStudentName() + " age : "+student.getAge());
        }
    }
}
