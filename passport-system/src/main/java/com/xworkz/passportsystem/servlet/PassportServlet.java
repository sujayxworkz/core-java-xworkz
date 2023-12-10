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

@WebServlet(urlPatterns = "/passport")
public class PassportServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String officeName =  req.getParameter("passportOfficeName");
        String givenName = req.getParameter("givenName");
        String surName =  req.getParameter("surName");
        String email = req.getParameter("email");
        String loginEmail = req.getParameter("loginMail");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String question = req.getParameter("hintQuestionName");
        String answer = req.getParameter("hintAnswerName");

        System.out.println(officeName);
        System.out.println(givenName);
        System.out.println(surName);
        System.out.println(email);
        System.out.println(loginEmail);
        System.out.println(password);
        System.out.println(confirmPassword);
        System.out.println(question);
        System.out.println(answer);

        PassportServiceImpl service = new PassportServiceImpl();
        PassportDTO passportDTO = new PassportDTO();

        passportDTO.setPassportOfficeName(officeName);
        passportDTO.setGivenName(givenName);
        passportDTO.setSurName(surName);
        passportDTO.setEmail(email);
        passportDTO.setLoginMail(loginEmail);
        passportDTO.setPassword(password);
        passportDTO.setConfirmPassword(confirmPassword);
        passportDTO.setHintQuestionName(question);
        passportDTO.setHintAnswerName(answer);

        req.setAttribute("userRegistration","Registration Successful");
        RequestDispatcher dispatcher = req.getRequestDispatcher("response.jsp");
        dispatcher.forward(req,resp);

        service.validateAndSavePassportInfo(passportDTO);


    }
}
