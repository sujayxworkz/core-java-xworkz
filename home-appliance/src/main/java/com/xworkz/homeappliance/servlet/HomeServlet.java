package com.xworkz.homeappliance.servlet;

import com.xworkz.homeappliance.dto.HomeApplianceDTo;
import com.xworkz.homeappliance.service.Impl.HomeServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/home",loadOnStartup = 1)
public class HomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        ServletContext servletContext = getServletContext();
        String url = servletContext.getContextPath();
        System.out.println(url);

        String name = req.getParameter("userName");
        String login = req.getParameter("loginId");
        String password = req.getParameter("password");
        String appliance = req.getParameter("applianceName");
        String material = req.getParameter("materialType");
        System.out.println(name);
        System.out.println(login);
        System.out.println(password);
        System.out.println(appliance);
        System.out.println(material);


        HomeServiceImpl service = new HomeServiceImpl();
        HomeApplianceDTo dTo = new HomeApplianceDTo();

        dTo.setUserName(name);
        dTo.setLoginId(login);
        dTo.setPassword(password);
        dTo.setApplianceName(appliance);
        dTo.setMaterialType(material);

        service.validateAndSave(dTo);

        req.setAttribute("name",name);
        RequestDispatcher dispatcher = req.getRequestDispatcher("response.jsp");
        dispatcher.forward(req,resp);

    }

}

