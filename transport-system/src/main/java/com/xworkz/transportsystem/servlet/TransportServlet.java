package com.xworkz.transportsystem.servlet;

import com.xworkz.transportsystem.dto.TransportDTO;
import com.xworkz.transportsystem.service.Impl.TransportServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/transport")
public class TransportServlet extends HttpServlet {

    public TransportServlet(){
        System.out.println("Servlet object is created");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet Object Initilization");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String transportName = req.getParameter("transportName");
        String stateName = req.getParameter("stateName");
        String login = req.getParameter("loginId");
        String user = req.getParameter("userName");
        String arrival = req.getParameter("arrivalTime");
        String departure = req.getParameter("departureTime");
        String password = req.getParameter("password");
        System.out.println(transportName);
        System.out.println(stateName);
        System.out.println(login);
        System.out.println(user);
        System.out.println(arrival);
        System.out.println(departure);
        System.out.println(password);


        req.setAttribute("transportname",transportName);
        req.setAttribute("statename",stateName);
        RequestDispatcher dispatcher = req.getRequestDispatcher("response.jsp");    
        dispatcher.forward(req,resp);

        TransportServiceImpl service = new TransportServiceImpl();
        TransportDTO transportDTO = new TransportDTO();

        transportDTO.setTransportName(transportName);
        transportDTO.setStateName(stateName);
        transportDTO.setLoginId(login);
        transportDTO.setPassword(password);
        transportDTO.setUserName(user);
        transportDTO.setArrivalTime(arrival);
        transportDTO.setDepartureTime(departure);

        service.validateAndSaveTransportInfo(transportDTO);


    }
}
