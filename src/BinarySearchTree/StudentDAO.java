package BinarySearchTree;

import java.io.*;
import java.util.List;

public class StudentDAO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String filePath;

    public StudentDAO(String filePath) {
        this.filePath = filePath;
    }

    // Ghi danh sách sinh viên vào tệp file
    public void writeToFile(List<Student> studentList) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(studentList);
            System.out.println("Đã ghi danh sách sinh viên vào tệp " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc danh sách sinh viên từ tệp file
    public List<Student> readFromFile() {
        List<Student> studentList = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            studentList = (List<Student>) inputStream.readObject();
            System.out.println("Đã đọc danh sách sinh viên từ tệp " + filePath);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
