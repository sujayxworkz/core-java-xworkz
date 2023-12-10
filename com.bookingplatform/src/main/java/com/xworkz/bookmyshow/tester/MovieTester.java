package com.xworkz.bookmyshow.tester;

import com.xworkz.bookmyshow.constant.Language;
import repository.Impl.BookMyShowRepositoryImpl;
import repository.BookMyShowRepository;
import com.xworkz.bookmyshow.dtoclasses.MovieTicketDTO;

import java.util.List;
import java.util.Scanner;

public class MovieTester {


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        BookMyShowRepository bookMyShow = new BookMyShowRepositoryImpl();

//        System.out.println("Enter the size");
//        int size = sc.nextInt();
//        int id = 6;
//        for(int i=0;i<size;i++){
//
//
//            MovieTicketDTO dto = MovieTicketDTO.builder().
//                    location(sc.next()).
//                    theatre(sc.next()).
//                    movieName(sc.next()).
//                    language(Language.valueOf(sc.next())).
//                    noOfTickets(sc.nextInt()).
//                    price(sc.nextDouble()).
//                    timings(sc.next()).
//                    ticketId(id++).
//                    build();
//
//                  bookMyShow.save(dto);
//
//        }
//        System.out.println("Enter the ticketId");

//        MovieTicketDTO movie = bookMyShow.getBookingInfoById(1);
//        System.out.println(movie.toString());
//
//         bookMyShow.updateNoOfTicketsById(7,4);
//         bookMyShow.updateMovieNameById("sanak",2);
//
//         bookMyShow.deleteMovieInfoById(2);

         List<MovieTicketDTO> movie1 = bookMyShow.findAll();
         System.out.println(movie1.toString());

         MovieTicketDTO movieTicketDTO = bookMyShow.fetchBookingInfoByTheaterName("meena");
        System.out.println(movieTicketDTO);

    }

}
