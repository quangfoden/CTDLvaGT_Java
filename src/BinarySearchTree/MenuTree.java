package BinarySearchTree;

import java.util.Scanner;

public class MenuTree {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        StudentDAO studentDAO = new StudentDAO("students2.dat");
        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Chèn sinh viên vào cây");
            System.out.println("3. Xoá sinh viên từ cây");
            System.out.println("4. Tìm sinh viên theo ID");
            System.out.println("5. Lưu danh sách sinh viên vào file");
            System.out.println("6. Đọc danh sách sinh viên từ file");
            System.out.println("7. Trở về menu chính");
            System.out.print("Chọn chức năng: ");
             choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nDanh sách sinh viên:");
                    bst.displayInOrder();
                    break;
                case 2:
                    System.out.println("\nNhập thông tin sinh viên:");
                    Student newStudent = getStudentFromInput(scanner);
                    bst.insert(newStudent);
                    break;
                case 3:
                    System.out.print("Nhập ID sinh viên cần xoá: ");
                    int id = scanner.nextInt();
                    Student deletedStudent = bst.delete(id);
                    if (deletedStudent != null) {
                        System.out.println("Đã xoá sinh viên: " + deletedStudent);
                    } else {
                        System.out.println("Không tìm thấy sinh viên có ID " + id);
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID sinh viên cần tìm: ");
                    int searchId = scanner.nextInt();
                    Student foundStudent = bst.search(searchId);
                    if (foundStudent != null) {
                        System.out.println("Sinh viên có ID " + searchId + ": " + foundStudent);
                    } else {
                        System.out.println("Không tìm thấy sinh viên có ID " + searchId);
                    }
                    break;
                case 5:
                    studentDAO.writeToFile(bst.toArrayList());
                    break;
                case 6:
                    bst.clear();
                    bst.addAll(studentDAO.readFromFile());
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }while(choice!=7);
    }

	private static Student getStudentFromInput(Scanner scanner) {
		System.out.print("Nhập ID: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Đọc bỏ kí tự Enter

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
