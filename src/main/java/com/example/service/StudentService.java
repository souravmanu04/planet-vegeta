package com.example.service;

import com.example.model.MarkBean;
import com.example.model.StudentBean;
import com.example.repository.MarkRepository;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private MarkRepository markRepository;

    public StudentBean addStudent(StudentBean studentBean) {
        studentRepository.save(studentBean);
        return studentBean;
    }


    public List<StudentBean> getAllStudents() {
        List<StudentBean> students = new ArrayList<>();
        studentRepository.findAll().forEach(stud -> students.add(stud));
        return students;
    }

    public void delete(int id) {
        studentRepository.deleteById(id);
    }


    public Optional<StudentBean> getStudentById(int id) {
        return studentRepository.findById(id);
    }


    public String addMark(int id, MarkBean markBean) {
        Optional<StudentBean> stud = studentRepository.findById(id);
        if (stud.isEmpty()) {
            return "Invalid id";
        }
        else{
            markBean.setMark_id(id);
            int m = markBean.getMark();
            markBean.setPerc((float) (m * 100) /100);
            markRepository.save(markBean);
            String status;
            if (markBean.getPerc() >= 40)
                status = "Passed";
            else
                status = "Failed";
            return "Percentage: " + markBean.getPerc() + "%\t" + status;
        }
    }

    public Optional<MarkBean> getMarkById(int id) {
        return markRepository.findById(id);
    }
}
