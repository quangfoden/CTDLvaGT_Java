package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class StudentLinkedList {
	private StudentNode head;

	// Chèn sinh viên vào đầu danh sách
	public void insertFirst(Student student) {
		StudentNode newNode = new StudentNode(student);
		newNode.setNext(head);
		head = newNode;
	}

	// Chèn sinh viên vào cuối danh sách
	public void insertLast(Student student) {
		StudentNode newNode = new StudentNode(student);
		if (head == null) {
			head = newNode;
			return;
		}
		StudentNode current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(newNode);
	}

	// Xoá sinh viên từ đầu danh sách
	public void deleteFirst() {
		if (head != null) {
			head = head.getNext();
		}
	}

	// Xoá sinh viên từ cuối danh sách
	public void deleteLast() {
		if (head == null || head.getNext() == null) {
			head = null;
			return;
		}
		StudentNode current = head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
	}

	// Hiển thị danh sách sinh viên
	public void display() {
		if (head == null) {
			System.out.println("Không có sinh viên nào trong danh sách.");
			return;
		}
		StudentNode current = head;
		while (current != null) {
			System.out.println(current.getStudent());
			current = current.getNext();
		}
	}

	public List<Student> getAllStudents() {
		List<Student> studentList = new ArrayList<>();
		StudentNode current = head;
		while (current != null) {
			studentList.add(current.getStudent());
			current = current.getNext();
		}
		return studentList;
	}

	public void setStudents(List<Student> students) {
		for (Student student : students) {
			insertLast(student);
		}
	}

	// Sắp xếp danh sách theo tên sinh viên (theo thứ tự tăng dần)
	public void sortByName() {
		if (head == null || head.getNext() == null) {
			return; // Danh sách trống hoặc chỉ có một phần tử, không cần sắp xếp
		}

		boolean swapped;
		do {
			swapped = false;
			StudentNode current = head;
			while (current.getNext() != null) {
				if (current.getStudent().getName().compareTo(current.getNext().getStudent().getName()) > 0) {
					// Hoán đổi thông tin của hai sinh viên
					Student temp = current.getStudent();
					current.setStudent(current.getNext().getStudent());
					current.getNext().setStudent(temp);
					swapped = true;
				}
				current = current.getNext();
			}
		} while (swapped);
	}

	// Tìm kiếm sinh viên theo tên
	public Student searchByName(String name) {
		StudentNode current = head;
		while (current != null) {
			if (current.getStudent().getName().equalsIgnoreCase(name)) {
				return current.getStudent(); // Trả về sinh viên nếu tên trùng khớp
			}
			current = current.getNext();
		}
		return null; // Trả về null nếu không tìm thấy sinh viên có tên tương ứng
	}

	// Thống kê sinh viên ở Huế
	public void countStudentsFromHue() {
		int count = 0;
		StudentNode current = head;
		while (current != null) {
			if (current.getStudent().getHometown().equalsIgnoreCase("Huế")) {
				count++;
			}
			current = current.getNext();
		}
		System.out.println("Số sinh viên đến từ Huế: " + count);
	}
}
