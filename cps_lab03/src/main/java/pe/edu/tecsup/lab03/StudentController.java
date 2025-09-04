package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void showStudent() {
        System.out.println("Mostrando estudiante...");
    }

    public void showStudentInfo(Long id) {
        System.out.println("Mostrando información del estudiante con ID: " + id);
        studentService.getStudentById(id);
    }
}
