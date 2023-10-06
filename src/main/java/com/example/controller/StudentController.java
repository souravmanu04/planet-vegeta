package com.example.controller;

import com.example.model.MarkBean;
import com.example.model.StudentBean;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<StudentBean> saveStudent(@RequestBody StudentBean student) throws Exception {
        StudentBean studentSavedToDB = this.studentService.addStudent(student);
        return new ResponseEntity<StudentBean>(studentSavedToDB, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    private List<StudentBean> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/del/{id}")
    private void delete(@PathVariable int id) {
        studentService.delete(id);
    }

    @GetMapping("/get/{id}")
    private Optional<StudentBean> getStudentById(@PathVariable ("id") int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/addmark/{id}")
    private String saveMark(@PathVariable int id, @RequestBody MarkBean markBean) throws Exception {
        return this.studentService.addMark(id, markBean);
    }

    @GetMapping("/getmark/{id}")
    private Optional<MarkBean> getMarkById(@PathVariable int id) {
        return studentService.getMarkById(id);
    }

}
