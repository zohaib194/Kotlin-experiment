package com.zohaib194.student.controller

import com.zohaib194.student.data.Student
import com.zohaib194.student.service.StudentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/api/student")
class StudentController(val studentService: StudentService) {

    @GetMapping
    fun getAllStudent(): ResponseEntity<List<Student>> = ResponseEntity.ok(studentService.fetchAllStudent())

    @GetMapping("/{id}")
    fun getStudentByID(@PathVariable id: Int) : ResponseEntity<Student?> {
        val student: Student? = studentService.fetchStudentByID(id)
        if (student != null) {
            return ResponseEntity.ok(student)
        }
        return ResponseEntity.badRequest().build()
    };
}