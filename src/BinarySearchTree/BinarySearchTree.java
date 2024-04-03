package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	private Node root;

	// Các phương thức khác

	// Thêm một sinh viên vào cây
	public void insert(Student student) {
		root = insertRecursive(root, student);
	}

	private Node insertRecursive(Node root, Student student) {
		if (root == null) {
			root = new Node(student);
			return root;
		}
		if (student.getId() < root.getStudent().getId()) {
			root.setLeftChild(insertRecursive(root.getLeftChild(), student));
		} else if (student.getId() > root.getStudent().getId()) {
			root.setRightChild(insertRecursive(root.getRightChild(), student));
		}
		return root;
	}

	// Hiển thị danh sách sinh viên theo thứ tự trung tuyến (in-order)
	public void displayInOrder() {
		displayInOrderRecursive(root);
	}

	private void displayInOrderRecursive(Node root) {
		if (root == null) {
			System.out.println("Không có sinh viên nào trong dánh sách.");
			return;
		}

		displayInOrderRecursive(root.getLeftChild());
		System.out.println(root.getStudent());
		displayInOrderRecursive(root.getRightChild());
	}

	// Tìm sinh viên trong cây theo ID
	public Student search(int id) {
		return searchRecursive(root, id);
	}

	public Student delete(int id) {
		Node[] nodesToDelete = new Node[1];
		root = deleteNode(root, id, nodesToDelete);
		return nodesToDelete[0] != null ? nodesToDelete[0].getStudent() : null;
	}

	private Node deleteNode(Node root, int id, Node[] nodesToDelete) {
		if (root == null) {
			return null;
		}

		if (id < root.getStudent().getId()) {
			root.setLeftChild(deleteNode(root.getLeftChild(), id, nodesToDelete));
		} else if (id > root.getStudent().getId()) {
			root.setRightChild(deleteNode(root.getRightChild(), id, nodesToDelete));
		} else {
			nodesToDelete[0] = root;
			if (root.getLeftChild() == null) {
				return root.getRightChild();
			} else if (root.getRightChild() == null) {
				return root.getLeftChild();
			}
			root.setStudent(findMin(root.getRightChild()).getStudent());
			root.setRightChild(deleteNode(root.getRightChild(), root.getStudent().getId(), nodesToDelete));
		}
		return root;
	}

	private Node findMin(Node node) {
		while (node.getLeftChild() != null) {
			node = node.getLeftChild();
		}
		return node;
	}

	private Student searchRecursive(Node root, int id) {
		if (root == null || root.getStudent().getId() == id) {
			return root != null ? root.getStudent() : null;
		}

		if (id < root.getStudent().getId()) {
			return searchRecursive(root.getLeftChild(), id);
		}
		return searchRecursive(root.getRightChild(), id);
	}

	public void clear() {
		root = null;
	}

	public void addAll(List<Student> students) {
		for (Student student : students) {
			insert(student);
		}
	}

	public List<Student> toArrayList() {
		List<Student> studentList = new ArrayList<>();
		toArrayList(root, studentList);
		return studentList;
	}

	private void toArrayList(Node root, List<Student> studentList) {
		if (root != null) {
			toArrayList(root.getLeftChild(), studentList);
			studentList.add(root.getStudent());
			toArrayList(root.getRightChild(), studentList);
		}
	}
}
