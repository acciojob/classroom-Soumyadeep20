package com.driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {
    private HashMap<String, Student> SRepo=new HashMap<>();
    private   HashMap<String, Teacher> TRepo=new HashMap<>();
    private   HashMap<String, List<String>> TSP=new HashMap<>();
    public void add(Student s)
    {
        String str=s.getName();
        SRepo.put(str,s);
    }
    public void addt(Teacher t)
    {
        String str=t.getName();
        TRepo.put(str,t);
    }
    public Student getStudentByName(String n)
    {
        if(SRepo.containsKey(n))
            return SRepo.get(n);
        return null;
    }

    public Teacher getTeacherByName(String n) {
        if(TRepo.containsKey(n))
            return TRepo.get(n);
        return null;
    }

    public List<String> getAllStudents() {
        List<String> l=new ArrayList<>();
        for(String k: SRepo.keySet())
            l.add(k);
        return l;

    }

    public void deletTecher(String t) {
        TRepo.remove(t);
    }

    public void deleteAllTeachers() {
        for(String k: TRepo.keySet())
            TRepo.remove(k);
    }

    public void addStudentTeacherPair(String s, String t) {
        String S=s;
        String T=t;
        if(TSP.containsKey(T))
        {
            List<String> a=TSP.get(T);
            a.add(s);
            TSP.put(T,a);
        }
        else {
            List<String> a=new ArrayList<>();
            a.add(s);
            TSP.put(T,a);
        }




    }

    public List<String> getStudentsByTeacherName(String t) {
        return  TSP.get(t);
    }
}
