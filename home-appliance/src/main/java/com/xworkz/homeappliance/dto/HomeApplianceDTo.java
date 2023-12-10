package com.xworkz.homeappliance.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@NamedQueries({
        @NamedQuery(name = "getLoginIdAndPassword", query = "select dto from HomeApplianceDTo dto where dto.loginId=:loginMail and dto.password=:password"),
        @NamedQuery(name = "getUsers", query = "select dto from HomeApplianceDTo dto"),
        @NamedQuery(name = "getById", query = "select dto from HomeApplianceDTo dto where id=:id"),
        @NamedQuery(name = "updateHome", query = "update HomeApplianceDTo dto set dto.userName=:uName where dto.id=:id"),
        @NamedQuery(name = "deleteById", query = "delete from HomeApplianceDTo dto where id=:id")
})
@Table
public class HomeApplianceDTo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String password;
    private String loginId;
    private String applianceName;
    private String materialType;


}
