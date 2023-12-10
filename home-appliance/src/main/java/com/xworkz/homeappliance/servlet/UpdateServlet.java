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

@WebServlet(urlPatterns = "/update",loadOnStartup = +1)
public class UpdateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String pId = req.getParameter("passportId");
        Integer passId = Integer.parseInt(pId);
        System.out.println(passId);

        HomeServiceImpl service = new HomeServiceImpl();
        HomeApplianceDTo home = service.validateAndGetById(passId);

        req.setAttribute("home",home);
        RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
        dispatcher.forward(req,resp);



    }
}
