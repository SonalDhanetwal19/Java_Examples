public class Student implements Comparable<Student>{
    private int rollNo;
    private String studentName;
    private int age;

    public Student(int rollNo, String studentName, int age) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s1) {
        if(rollNo == s1.getRollNo())
        return 0;
        else if (rollNo > s1.getRollNo()) {
            return 1;
        }
        else return -1;
    }
}
