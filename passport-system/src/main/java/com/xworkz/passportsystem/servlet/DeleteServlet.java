package com.xworkz.passportsystem.servlet;

import com.xworkz.passportsystem.service.Impl.PassportServiceImpl;

import javax.servlet.Servlet;
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

        String pId = req.getParameter("passportId");
        Integer passId = Integer.parseInt(pId);
        System.out.println(passId);

        PassportServiceImpl service = new PassportServiceImpl();
        boolean isDeleted = service.deletePassportInfo(passId);

        if(isDeleted=true){
            resp.sendRedirect("getUsers");
        }else{
            req.setAttribute("delete","delete failed");
        }
        isDeleted = true;


    }

}
