package org.example.controller;

import org.example.model.User;
import org.example.model.UserDao;
import org.example.model.UserNotFoundException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="authServlet", urlPatterns = {"/authorization"})
public class authServlet extends HttpServlet {

    private UserDao userDao = new UserDao();


    private void findUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String userLogin = req.getParameter("login");
//        String userPassword = req.getParameter("password");
//
//        try{
//            User currentUser = userDao.checkUser(userLogin, userPassword);
//            req.getSession().setAttribute("user", currentUser);
//            req.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(req, resp);
//        } catch (UserNotFoundException e){
//            req.setAttribute("errorMessage", e.getMessage());
//            req.getRequestDispatcher("/WEB-INF/view/error.jsp").forward(req, resp);
//        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        findUser(req, resp);
    }
}
