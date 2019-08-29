package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = false;


        try {
            User registeredUser = DaoFactory.getUsersDao().findByUsername(username);
            System.out.println(registeredUser.getUsername());
            if (BCrypt.checkpw(password, registeredUser.getPassword())) {
                validAttempt=true;

            }
            if (validAttempt) {
                // TODO: store the logged in user object in the session, instead of just the username
                request.getSession().setAttribute("user", registeredUser);
                response.sendRedirect("/profile");
            } else {
                response.sendRedirect("/login");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }



        // TODO: find a record in your database that matches the submitted password
        // TODO: make sure we find a user with that username
        // TODO: check the submitted password against what you have in your database

    }
}
