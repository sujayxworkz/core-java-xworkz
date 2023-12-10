package com.xworkz.passportsystem.servlet;

import com.xworkz.passportsystem.dto.PassportDTO;
import com.xworkz.passportsystem.service.Impl.PassportServiceImpl;

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
    PassportServiceImpl service = new PassportServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("loginMail");
        String password = req.getParameter("password");
        System.out.println(login);
        System.out.println(password);

        List<PassportDTO> userExist = service.getLoginIdAndPassword(login,password);

        if(!userExist.isEmpty()){
            req.setAttribute("login","login successful");
        }else {
            req.setAttribute("login","login failed");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
        dispatcher.forward(req,resp);

    }
}
