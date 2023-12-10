package com.xworkz.passportsystem.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Setter
@ToString
@Getter
@NamedQueries({
        @NamedQuery(name = "getLoginIdAndPassword", query = "select dto from PassportDTO dto where dto.loginMail=:loginId and dto.password=:password"),
        @NamedQuery(name = "getUsersList", query = "select dto from PassportDTO dto"),
        @NamedQuery(name = "getById", query = "select dto from PassportDTO dto where id=:id"),
        @NamedQuery(name = "deleteById", query = "delete from PassportDTO dto where id=:id")
})
@Table
public class PassportDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String passportOfficeName;
    private String givenName;
    private String surName;
    private String email;
    private String loginMail;
    private String password;
    private String confirmPassword;
    private String hintQuestionName;
    private String hintAnswerName;

}
