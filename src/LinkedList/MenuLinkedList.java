package LinkedList;

import java.util.Scanner;

public class MenuLinkedList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentLinkedList studentList = new StudentLinkedList();
		StudentDAO studentDAO = new StudentDAO("D://CTDL&GT/students.dat");
		int choice;
		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1. Hiển thị danh sách sinh viên");
			System.out.println("2. Chèn sinh viên vào đầu danh sách");
			System.out.println("3. Chèn sinh viên vào cuối danh sách");
			System.out.println("4. Xoá sinh viên từ đầu danh sách");
			System.out.println("5. Xoá sinh viên từ cuối danh sách");
			System.out.println("6. Thống kê sinh viên ở Huế");
			System.out.println("7. Sắp xếp danh sách theo tên sinh viên");
			System.out.println("8. Tìm kiếm sinh viên theo tên");
			System.out.println("9. Lưu danh sách sinh viên vào file");
			System.out.println("10. Đọc danh sách sinh viên từ file");
			System.out.println("11. Trở về menu chính");
			System.out.print("Chọn chức năng: ");
			 choice = scanner.nextInt();

			switch (choice) {
			case 1:
				studentList.display();
				break;
			case 2:
				addStudentToHead(scanner, studentList);
				System.out.print("Thêm sinh viên thành công !");
				break;
			case 3:
				addStudentToTail(scanner, studentList);
				System.out.print("Thêm sinh viên thành công !");
				break;
			case 4:
				studentList.deleteFirst();
				System.out.println("Đã xoá sinh viên từ đầu danh sách.");
				break;
			case 5:
				studentList.deleteLast();
				System.out.println("Đã xoá sinh viên từ cuối danh sách.");
				break;
			case 6:
				studentList.countStudentsFromHue();
				break;
			case 7:
				studentList.sortByName();
				System.out.println("Đã sắp xếp danh sách theo tên sinh viên.");
				break;
			case 8:
				searchStudentByName(scanner, studentList);
				break;
			case 9:
				studentDAO.writeToFile(studentList.getAllStudents());
				break;
			case 10:
				studentList.setStudents(studentDAO.readFromFile());
				System.out.println("Đã đọc danh sách sinh viên từ file.");
				break;
			case 11:
				break;
			default:
				System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
			}
		} while (choice != 11);
	}

	private static void addStudentToHead(Scanner scanner, StudentLinkedList studentList) {
		System.out.println("\nNhập thông tin sinh viên:");
		Student newStudent = getStudentFromInput(scanner);
		studentList.insertFirst(newStudent);
	}

	private static void addStudentToTail(Scanner scanner, StudentLinkedList studentList) {
		System.out.println("\nNhập thông tin sinh viên:");
		Student newStudent = getStudentFromInput(scanner);
		studentList.insertLast(newStudent);
	}

	private static void searchStudentByName(Scanner scanner, StudentLinkedList studentList) {
		System.out.print("Nhập tên sinh viên cần tìm: ");
		String name = scanner.next();
		Student student = studentList.searchByName(name);
		if (student != null) {
			System.out.println("Thông tin sinh viên:");
			System.out.println(student);
		} else {
			System.out.println("Không tìm thấy sinh viên có tên " + name);
		}
	}

	private static Student getStudentFromInput(Scanner scanner) {
		System.out.print("Nhập ID sinh viên: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		System.out.print("Nhập mã sinh viên: ");
		String studentCode = scanner.nextLine();
		System.out.print("Nhập tên sinh viên: ");
		String name = scanner.nextLine();
		System.out.print("Nhập ngành học: ");
		String major = scanner.nextLine();
		System.out.print("Nhập quê quán: ");
		String hometown = scanner.nextLine();

		return new Student(id, studentCode, name, major, hometown);
	}
}
