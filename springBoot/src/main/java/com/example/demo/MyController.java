package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")  // izinkan request dari semua origin (React, Android, dll.)
public class MyController {

    @Autowired
    StudentService ss;

    // ========== TEST ENDPOINT ==========
    // GET http://localhost:8080/
    @GetMapping("/")
    public ResponseEntity<?> test() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Tested Ok");
    }

    // ========== REGISTER STUDENT ==========
    // POST http://localhost:8080/register
    // Body (JSON): { "fullname":"...", "email":"...", "password":"...", "address":"..." }
    @PostMapping("/register")
    public ResponseEntity<?> registration(@RequestBody Student s) {
        try {
            ss.registration(s);
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body("Registration Successfully Completed");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Fail: " + e.getMessage());
        }
    }

    // ========== GET ALL STUDENTS ==========
    // GET http://localhost:8080/students
    @GetMapping("/students")
    public ResponseEntity<?> getAllStudents() {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(ss.getallstudents());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Fail: " + e.getMessage());
        }
    }
}
