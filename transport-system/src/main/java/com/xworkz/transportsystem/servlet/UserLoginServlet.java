package com.xworkz.transportsystem.servlet;

import com.xworkz.transportsystem.dto.TransportDTO;
import com.xworkz.transportsystem.service.Impl.TransportServiceImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/login")
public class UserLoginServlet extends HttpServlet
{
    TransportServiceImpl transportService = new TransportServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("loginId");
        String password = req.getParameter("password");
        System.out.println(login);
        System.out.println(password);

        List<TransportDTO> userExist = transportService.getLoginIdAndPassword(login,password);

        if(!userExist.isEmpty()) {
            req.setAttribute("login", "login successful");
        }else {
            req.setAttribute("login", "login failed");
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
        dispatcher.forward(req,resp);

    }
}