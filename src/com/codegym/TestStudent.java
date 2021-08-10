package com.codegym;

public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Huong Dep Trai");
        student.setClasses("C0621H1");

        System.out.println(student.getName() + " - " + student.getClasses());
    }
}
