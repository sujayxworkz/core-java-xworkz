package com.xworkz.transportsystem.servlet;

import com.xworkz.transportsystem.dto.TransportDTO;
import com.xworkz.transportsystem.service.Impl.TransportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateUser",loadOnStartup = +1)
public class UpdateTransportServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pId = req.getParameter("id");
        Integer passId = Integer.parseInt(pId);
        System.out.println(passId);

        TransportServiceImpl service = new TransportServiceImpl();
        TransportDTO dto = new TransportDTO();

        dto.setUserName(req.getParameter("userName"));
        dto.setLoginId(req.getParameter("loginId"));
        dto.setPassword(req.getParameter("password"));
        dto.setTransportName(req.getParameter("transportName"));
        dto.setArrivalTime(req.getParameter("arrivalTime"));
        dto.setDepartureTime(req.getParameter("departureTime"));
        dto.setStateName(req.getParameter("stateName"));

        resp.sendRedirect("getUsers");
        service.updateTransportInfo(dto,passId);

    }

}
