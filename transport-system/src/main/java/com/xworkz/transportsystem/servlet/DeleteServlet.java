package com.xworkz.transportsystem.servlet;

import com.xworkz.transportsystem.service.Impl.TransportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete",loadOnStartup = +1)
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pId = req.getParameter("transportId");
        Integer passId = Integer.parseInt(pId);
        System.out.println(passId);

        TransportServiceImpl service = new TransportServiceImpl();
        boolean isDeleted = service.deleteTransportInfo(passId);

        if(isDeleted==true){
            resp.sendRedirect("getUsers");
            req.setAttribute("delete","delete successfull");
        }else{
            req.setAttribute("delete","delete failed");
        }

    }
}
