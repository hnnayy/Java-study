package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo sr;

    // Simpan data student ke database
    // => INSERT INTO student (fullname, email, password, address) VALUES (...)
    public void registration(Student s) {
        sr.save(s);
    }

    // Ambil semua data student dari database
    // => SELECT * FROM student
    public List<Student> getallstudents() {
        return sr.findAll();
    }
}
