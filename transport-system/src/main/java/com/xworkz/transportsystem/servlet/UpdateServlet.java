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

@WebServlet(urlPatterns = "/update",loadOnStartup = +1)
public class UpdateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pId = req.getParameter("transportId");
        Integer passId = Integer.parseInt(pId);
        System.out.println(passId);

        TransportServiceImpl service = new TransportServiceImpl();
        TransportDTO dto = service.validateAndGetById(passId);

        req.setAttribute("transport",dto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
        dispatcher.forward(req,resp);

    }
}
