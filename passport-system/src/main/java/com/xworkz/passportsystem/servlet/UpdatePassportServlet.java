package com.xworkz.passportsystem.servlet;

import com.xworkz.passportsystem.dto.PassportDTO;
import com.xworkz.passportsystem.service.Impl.PassportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateUser",loadOnStartup = +1)
public class UpdatePassportServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pId = req.getParameter("passId");
//        int passId = Integer.parseInt(pId);
        System.out.println(Integer.parseInt(pId) + "passport id");

        PassportServiceImpl service = new PassportServiceImpl();
        PassportDTO passportDTO = new PassportDTO();

        passportDTO.setPassportOfficeName(req.getParameter("passportOfficeName"));
        passportDTO.setGivenName(req.getParameter("givenName"));
        passportDTO.setSurName(req.getParameter("surName"));
        passportDTO.setLoginMail(req.getParameter("loginMail"));
        passportDTO.setPassword(req.getParameter("password"));
        passportDTO.setConfirmPassword(req.getParameter("confirmPassword"));
        passportDTO.setEmail(req.getParameter("email"));
        passportDTO.setHintQuestionName(req.getParameter("hintQuestionName"));
        passportDTO.setHintAnswerName(req.getParameter("hintAnswerName"));

        resp.sendRedirect("getUsers");
        service.updatePassportInfo(passportDTO, Integer.parseInt(pId));

    }
}
