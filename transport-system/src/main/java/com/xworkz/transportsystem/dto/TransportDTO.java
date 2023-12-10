package com.xworkz.transportsystem.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
@NamedQueries({
        @NamedQuery(name = "getLoign", query = "select dto from TransportDTO dto where dto.loginId=:loginMail and dto.password=:password"),
        @NamedQuery(name = "getUsersList", query = "select dto from TransportDTO dto"),
        @NamedQuery(name = "validateById", query = "select dto from TransportDTO dto where id=:id"),
        @NamedQuery(name = "deleteById", query = "delete TransportDTO dto where dto.id=:id")
})
@Table
public class TransportDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String loginId;
    private String password;
    private String userName;
    private String arrivalTime;
    private String departureTime;
    private String transportName;
    private String stateName;

}
