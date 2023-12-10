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

@WebServlet(urlPatterns = "/getUsers",loadOnStartup = +1)
public class GetUserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        TransportServiceImpl service = new TransportServiceImpl();
        List<TransportDTO> getUsers = service.getAllUsers();
        System.out.println(getUsers);

        req.setAttribute("users",getUsers);
        RequestDispatcher dispatcher = req.getRequestDispatcher("userlist.jsp");
        dispatcher.forward(req,resp);

    }
}
