package LinkedList;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String studentCode;
    private String name;
    private String major;
    private String hometown;

    public Student(int id, String studentCode, String name, String major, String hometown) {
        this.id = id;
        this.studentCode = studentCode;
        this.name = name;
        this.major = major;
        this.hometown = hometown;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Mã sinh viên: " + studentCode + ", Tên: " + name + ", Ngành học: " + major + ", Quê quán: " + hometown;
    }
}
