package org.example.controller;

import org.example.model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "tempServlet", urlPatterns = {"/"})
public class tempServlet extends HttpServlet {

    private static String successPath = "/WEB-INF/view/index.jsp";
    private static String errorPath = "/WEB-INF/view/error.jsp";

    private Model model = new BusinessLogic();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path;
        List<TimetableRow> timetable = null;
        try {
            timetable = model.getTimetable();
            req.setAttribute("timetableList", timetable);
            path = successPath;
        } catch (Exception e) {
            System.out.println(e);
            req.setAttribute("errorMessage", e);
            path = errorPath;
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }

}
