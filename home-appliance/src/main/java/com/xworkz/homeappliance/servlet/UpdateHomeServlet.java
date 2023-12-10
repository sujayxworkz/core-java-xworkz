package com.xworkz.homeappliance.servlet;


import com.xworkz.homeappliance.dto.HomeApplianceDTo;
import com.xworkz.homeappliance.service.Impl.HomeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateUser",loadOnStartup = +1)
public class UpdateHomeServlet extends  HomeServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        Integer pasId = Integer.parseInt(id);
        System.out.println(pasId);

        HomeServiceImpl service = new HomeServiceImpl();
        HomeApplianceDTo dTo = new HomeApplianceDTo();

        dTo.setUserName(req.getParameter("userName"));
        dTo.setLoginId(req.getParameter("loginId"));
        dTo.setPassword(req.getParameter("password"));
        dTo.setApplianceName(req.getParameter("applianceName"));
        dTo.setMaterialType(req.getParameter("materialType"));

        resp.sendRedirect("getAllUsers");
        service.updateHomeInfo(dTo,pasId);



    }
}
