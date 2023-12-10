package com.xworkz.passportsystem.servlet;

import com.xworkz.passportsystem.dto.PassportDTO;
import com.xworkz.passportsystem.service.Impl.PassportServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/getUsers",loadOnStartup = +1)
public class UserListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PassportServiceImpl service = new PassportServiceImpl();

        List<PassportDTO> getUsers = service.getUsersInfo();

        req.setAttribute("users",getUsers);
        RequestDispatcher dispatcher = req.getRequestDispatcher("getUsersList.jsp");
        dispatcher.forward(req,resp);

    }
}
