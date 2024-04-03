package Dequy;

import java.util.Scanner;

public class MenuDeQuy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1. Tính giai thừa");
			System.out.println("2. Chuỗi Fibonacci");
			System.out.println("3. Lũy thừa");
			System.out.println("4. Ước số chung lớn nhất");
			System.out.println("5. Tìm kiếm nhị phân");
			System.out.println("6. Tháp Hà Nội");
			System.out.println("7. Thuật toán sắp xếp Bubble Sort (nổi bọt)");
			System.out.println("8. Thuật toán sắp xếp Insertion Sort (chèn)");
			System.out.println("9. Thuật toán sắp xếp Merge Sort (trộn)");
			System.out.println("10. Thuật toán sắp xếp Quick Sort(nhanh)");
			System.out.println("0. Trở về menu chính");
			System.out.print("Nhập lựa chọn của bạn: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Nhập số nguyên dương: ");
				int num = scanner.nextInt();
				System.out.println("Giai thừa của " + num + " là: " + DeQuyVaSapXep.factorial(num));
				break;
			case 2:
				System.out.print("Nhập số nguyên dương: ");
				int n = scanner.nextInt();
				System.out.println("Dãy Fibonacci " + n + " số: ");
				for (int i = 0; i < n; i++) {
					System.out.print(DeQuyVaSapXep.fibonacci(i) + " ");
				}
				System.out.println();
				break;
			case 3:
				System.out.print("Nhập cơ số: ");
				int base = scanner.nextInt();
				System.out.print("Nhập số mũ: ");
				int exponent = scanner.nextInt();
				System.out.println(base + " mũ " + exponent + " là: " + DeQuyVaSapXep.power(base, exponent));
				break;
			case 4:
				System.out.print("Nhập số nguyên thứ nhất: ");
				int a = scanner.nextInt();
				System.out.print("Nhập số nguyên thứ hai: ");
				int b = scanner.nextInt();
				System.out
						.println("Ước số chung lớn nhất của " + a + " và " + b + " là: " + DeQuyVaSapXep.gcd(a, b));
				break;
			case 5:
				int[] arr = { 2, 3, 4, 10, 40 };
				System.out.print("Nhập số cần tìm: ");
				int key = scanner.nextInt();
				int result = DeQuyVaSapXep.binarySearch(arr, 0, arr.length - 1, key);
				if (result == -1) {
					System.out.println("Không tìm thấy phần tử");
				} else {
					System.out.println("Phần tử được tìm thấy tại chỉ số " + result);
				}
				break;
			case 6:
				System.out.print("Nhập số đĩa: ");
				int nDisks = scanner.nextInt();
				DeQuyVaSapXep.towerOfHanoi(nDisks, 'A', 'C', 'B');
				break;
			case 7:
				int[] array1 = {64, 34, 25, 12, 22, 11, 90};
				System.out.print("Mảng ban đầu là: ");
				for (int i = 0; i < array1.length; i++) {
				    System.out.print(array1[i] + " ");
				}
				System.out.println();

				DeQuyVaSapXep.bubbleSort(array1);
				System.out.println("Mảng sau khi sắp xếp bằng Bubble Sort(nổi bọt): ");
				for (int i : array1) {
					System.out.print(i + " ");
				}
				System.out.println();
				break;
			case 8:
				int[] array2 = { 12, 11, 13, 5, 6 };
				System.out.print("Mảng ban đầu là: ");
				for (int i = 0; i < array2.length; i++) {
				    System.out.print(array2[i] + " ");
				}
				System.out.println();
				DeQuyVaSapXep.insertionSort(array2);
				System.out.println("Mảng sau khi sắp xếp bằng Insertion Sort(chèn): ");
				for (int i : array2) {
					System.out.print(i + " ");
				}
				System.out.println();
				break;
			case 9:
				int[] array3 = { 12, 11, 13, 5, 6, 7 };
				System.out.print("Mảng ban đầu là: ");
				for (int i = 0; i < array3.length; i++) {
				    System.out.print(array3[i] + " ");
				}
				System.out.println();
				DeQuyVaSapXep.mergeSort(array3, 0, array3.length - 1);
				System.out.println("Mảng sau khi sắp xếp bằng Merge Sort(Sắp xếp trộn): ");
				for (int i : array3) {
					System.out.print(i + " ");
				}
				System.out.println();
				break;
			case 10:
				int[] array4 = { 10, 7, 8, 9, 1, 5 };
				System.out.print("Mảng ban đầu là: ");
				for (int i = 0; i < array4.length; i++) {
				    System.out.print(array4[i] + " ");
				}
				System.out.println();
				DeQuyVaSapXep.quickSort(array4, 0, array4.length - 1);
				System.out.println("Mảng sau khi sắp xếp bằng Quick Sort(Sắp xếp nhanh): ");
				for (int i : array4) {
					System.out.print(i + " ");
				}
				System.out.println();
				break;
			case 0:
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ!");
			}
		} while (choice != 0);
		
	}
}
