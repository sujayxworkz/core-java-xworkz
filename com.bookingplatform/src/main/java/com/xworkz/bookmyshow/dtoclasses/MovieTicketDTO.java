package com.xworkz.bookmyshow.dtoclasses;

import com.xworkz.bookmyshow.constant.Language;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "movie_tickets")
@NamedQuery(name="findAll",query = "select dto from MovieTicketDTO as dto")
public class MovieTicketDTO  {

    @Id
    @Column(name = "ticket_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId ;

    @Column(name = "movie_name")
    private String movieName;

    @Enumerated(EnumType.STRING)
    @Column(name = "movie_language")
    private Language language;

    @Column(name = "location")
    private String location;

    @Column(name = "price")
    private double price;

    @Column(name = "no_of_tickets")
    private int noOfTickets;

    @Column(name = "theatre")
    private String theatre;


    @Column(name = "timings")
    private String timings;

}

















































































