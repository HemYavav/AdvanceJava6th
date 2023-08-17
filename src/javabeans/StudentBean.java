package javabeans;

public class StudentBean {

    private String name;
    private int age;
    private double grade;

    // Getter and Setter methods for the "name" property
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for the "age" property
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter methods for the "grade" property
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        // Create an instance of StudentBean
        StudentBean student = new StudentBean();

        // Set values for properties
        student.setName("Hem Narayan YAdav");
        student.setAge(25);
        student.setGrade(85.5);

        // Print out the values using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Grade: " + student.getGrade());
    }
}
