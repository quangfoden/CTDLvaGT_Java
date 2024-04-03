package LinkedList;

public class StudentNode {
    private Student student;
    private StudentNode next;

    public StudentNode(Student student) {
        this.student = student;
    }

    // Getters and setters
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }
}
