package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
@Autowired
StudentRepository stdRepo;
    public void addStudent(Student s)
    {
            stdRepo.add(s);

    }
    public void addTeacher(Teacher t)
    {
        stdRepo.addt(t);
    }
    public Student getStudentByName(String n)
    {
        return stdRepo.getStudentByName(n);
    }

    public Teacher getTeacherByName(String n) {
        return stdRepo.getTeacherByName(n);
    }

    public List<String> getAllStudents() {
        return stdRepo.getAllStudents();
    }

    public void deletTecher(String t) {
        stdRepo.deletTecher(t);
    }

    public void deleteAllTeachers() {
        stdRepo.deleteAllTeachers();
    }

    public void addStudentTeacherPair(String s, String t) {
        stdRepo.addStudentTeacherPair(s,t);

    }

    public List<String> getStudentsByTeacherName(String t) {
        return stdRepo.getStudentsByTeacherName(t);
    }
}
