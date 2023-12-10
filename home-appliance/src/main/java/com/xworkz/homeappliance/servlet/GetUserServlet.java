package com.xworkz.homeappliance.servlet;

import com.xworkz.homeappliance.dto.HomeApplianceDTo;
import com.xworkz.homeappliance.service.Impl.HomeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/getAllUsers")
public class GetUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HomeServiceImpl service = new HomeServiceImpl();
        List<HomeApplianceDTo> getUsers = service.getHomeApplianceInfo();
        System.out.println(getUsers);

        req.setAttribute("users",getUsers);
        RequestDispatcher dispatcher = req.getRequestDispatcher("getlist.jsp");
        dispatcher.forward(req,resp);
    }
}
