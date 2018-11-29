package com.comp4382.ass3.assignment3.student;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StudentRepository
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}