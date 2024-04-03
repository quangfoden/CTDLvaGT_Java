package BinarySearchTree;


public class Node {
    private Student student;
    private Node leftChild;
    private Node rightChild;
    
    
	public Node() {
		super();
	}
	 // Constructor
    public Node(Student student) {
        this.student = student;
        this.leftChild = null;
        this.rightChild = null;
    }
	public Node(Student student, Node leftChild, Node rightChild) {
		super();
		this.student = student;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Node getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

    // Constructor, getters và setters
    
}
