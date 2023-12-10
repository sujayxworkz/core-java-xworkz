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

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pass = req.getParameter("passportId");
        Integer passId = Integer.parseInt(pass);
        System.out.println(passId);

        HomeServiceImpl service = new HomeServiceImpl();
        boolean isDeleted = service.deleteHomeInfoById(passId);

        if(isDeleted == true){
            resp.sendRedirect("getAllUsers");
            req.setAttribute("delete","deleted");
        }else{
            req.setAttribute("delete","not deleted");
        }

    }
}
