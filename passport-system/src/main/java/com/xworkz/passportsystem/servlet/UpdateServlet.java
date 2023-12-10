package com.xworkz.passportsystem.servlet;

import com.xworkz.passportsystem.dto.PassportDTO;
import com.xworkz.passportsystem.service.Impl.PassportServiceImpl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/update",loadOnStartup = +1)
public class UpdateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pId = req.getParameter("passportId");
        Integer passId = Integer.parseInt(pId);
        System.out.println(passId);

        PassportServiceImpl service = new PassportServiceImpl();
        PassportDTO dto = service.getUserById(passId);

        req.setAttribute("passport",dto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
        dispatcher.forward(req,resp);

    }
}
