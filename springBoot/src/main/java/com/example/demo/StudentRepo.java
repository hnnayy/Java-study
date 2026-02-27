package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    // JpaRepository sudah menyediakan method:
    // save(), findAll(), findById(), deleteById(), dll.
    // Tidak perlu tulis query SQL manual!
}
