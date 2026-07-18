package com.library.model;

public class Student {

    private int studentId;
    private String name;
    private String email;
    private String phone;
    private String department;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(int studentId, String name, String email, String phone, String department) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.department = department;
    }

    // Getters and Setters

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                "\nName: " + name +
                "\nEmail: " + email +
                "\nPhone: " + phone +
                "\nDepartment: " + department;
    }
}