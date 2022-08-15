package com.zohaib194.student.service

import com.zohaib194.student.data.Student
import org.springframework.stereotype.Service

@Service
class StudentService {

    private val studentList: List<Student> = listOf(
        Student(1, "Captain", "Morris"),
        Student(2, "Iron", "Man"),
        Student(3, "Ms.", "Marvel"),
    )

    fun fetchAllStudent(): List<Student> = studentList

    fun fetchStudentByID(id: Int): Student? = studentList.find { student: Student -> student.id == id }
}