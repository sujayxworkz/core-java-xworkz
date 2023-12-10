package service;

import com.xworkz.bookmyshow.dtoclasses.MovieTicketDTO;

import java.util.List;

public interface BookMyShowService {
   public boolean save(MovieTicketDTO dto);

    public  boolean addMovieTicket(MovieTicketDTO dto);

    public MovieTicketDTO getBookingInfoById(int id);

    public void updateNoOfTicketsById(int updatedNoOfTickets,int id);

    public void updateMovieNameById(String updatedMovieName,int id);

    public  void deleteMovieInfoById(int id);

    public List<MovieTicketDTO> findAll();

 public MovieTicketDTO fetchBookingInfoByTheaterName(String theatreName);
}
