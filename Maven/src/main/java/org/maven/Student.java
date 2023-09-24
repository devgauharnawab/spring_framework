package org.maven;


public class Student {
    private int studentId;
    private String name;
    private String address;

    public Student() {
        // Default constructor
        super();
    }

    public Student(int studentId, String name, String address) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("Set studen id");
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
