package BinarySearchTree;

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

	public int getId() {
		return id;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public String getHometown() {
		return hometown;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Mã sinh viên: " + studentCode + ", Tên: " + name + ", Ngành học: " + major
				+ ", Quê quán: " + hometown;
	}
}
