//package com.codeup.adlister.controllers;
//
//import com.codeup.adlister.dao.DaoFactory;
//import com.codeup.adlister.models.User;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
//public class RegisterServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // TODO: show the registration form
//
//        request.getRequestDispatcher("WEB-INF/users/create.jsp").forward(request, response);
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // TODO: ensure the submitted information is valid
//        User newUser = new User();
//        // TODO: create a new user based off of the submitted information
//
//        newUser.setUsername(request.getParameter("username"));
//        newUser.setEmail(request.getParameter("email"));
//        newUser.setPassword(request.getParameter("password"));
//        Long id = DaoFactory.getUsersDao().insert(newUser);
//        newUser.setId(id);
//        request.getSession().setAttribute("user", newUser);
//        response.sendRedirect("/profile");
//        // TODO: if a user was successfully created, send them to their profile
//    }
//}
