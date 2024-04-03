package Main;

import java.util.Scanner;

import BinarySearchTree.MenuTree;
import Dequy.MenuDeQuy;
import LinkedList.MenuLinkedList;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        MenuTree tree = new MenuTree();
        MenuLinkedList list = new MenuLinkedList();
        MenuDeQuy menuDeQuy = new MenuDeQuy();
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Làm việc với bài toán đệ quy và thuật toán sắp xếp");
            System.out.println("2. Làm việc với CTDL danh sách liên kết đơn");
            System.out.println("3. Làm việc với CTDL cây nhị phân");
            System.out.println("4. Thoát");
            System.out.print("Mời bạn chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    menuDeQuy.main(args);
                    break;
                case 2:
                    list.main(args);
                    break;
                case 3:
                    tree.main(args);
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
