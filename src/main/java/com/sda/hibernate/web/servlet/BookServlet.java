package com.sda.hibernate.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/Book")
public class BookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        req.setAttribute("title", session.getAttribute("title"));
        req.setAttribute("isbn", session.getAttribute("isbn"));
        req.getRequestDispatcher("book.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        String titleParam = req.getParameter("title");
        session.setAttribute("title", titleParam);
        String isbnParam = req.getParameter("isbn");
        session.setAttribute("isbn", isbnParam);

        resp.addCookie(new Cookie("title", titleParam));
        re

        resp.sendRedirect("Book");
    }
}
