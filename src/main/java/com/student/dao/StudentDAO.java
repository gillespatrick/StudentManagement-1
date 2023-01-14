package com.student.dao;

import com.student.models.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gilles
 */
public class StudentDAO {

    public static List<Student> getStudents() {
        //create an empty list
        List<Student> students = new ArrayList<>();

        //add sample data
        students.add(new Student("Christ ", "Bikou ", "bikou@gmail.com"));
        students.add(new Student("Gilles Patrick ", "Ngondo ", "ngondogillespatrick@gmail.com"));
        students.add(new Student("Yvan ", "Dipanda ", "yavandipanda@gmail.com"));

        return students;

    }

}
