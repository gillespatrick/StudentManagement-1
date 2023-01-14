package com.student.controller;

import com.student.dao.StudentDAO;
import com.student.models.Student;
import java.io.IOException;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gilles
 */
@WebServlet(name = "students_list", urlPatterns = {"/students_list"})
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Step 1- Get the student from the helper class
        List<Student> students = StudentDAO.getStudents();

        //Step 2- Add the students in the request object
        request.setAttribute("students_list", students);

        //Step 3- Display the students
        String url = "/WEB-INF/listStudents.jsp";
        this.getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
