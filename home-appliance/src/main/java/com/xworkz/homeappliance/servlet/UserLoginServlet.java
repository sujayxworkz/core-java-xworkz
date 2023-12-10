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

@WebServlet(urlPatterns = "/login",loadOnStartup = +1)
public class UserLoginServlet extends HttpServlet {

    HomeServiceImpl service = new HomeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("loginId");
        String password = req.getParameter("password");
        System.out.println(login);
        System.out.println(password);

        List<HomeApplianceDTo> userExist = service.getLoginIdAndPassword(login,password);
        System.out.println(login);
        System.out.println(password);



        if( !userExist.isEmpty() ){
            req.setAttribute("login","login successful");
        }else{
            req.setAttribute("login","login failed");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
        dispatcher.forward(req,resp);

    }
}