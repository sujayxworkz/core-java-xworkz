package service.Impl;

import com.xworkz.bookmyshow.dtoclasses.MovieTicketDTO;
import repository.BookMyShowRepository;
import service.BookMyShowService;

import javax.persistence.*;
import java.util.List;

public class BookMyShowServiceyImpl implements BookMyShowService {

    BookMyShowRepository bookMyShowRepository;

    @Override
    public MovieTicketDTO getBookingInfoById(int id) {


//        Persistence persistence = new Persistence();
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com_xworkz");
//
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//
//
//        MovieTicketDTO movieTicketDTO = entityManager.find(MovieTicketDTO.class,1);
//        System.out.println(movieTicketDTO);

        return new Persistence().
                createEntityManagerFactory("com_xworkz").
                createEntityManager().
                find(MovieTicketDTO.class,id);
    }

    @Override
    public void updateNoOfTicketsById(int updatedNoOfTickets, int id) {

        EntityManager entityManager = new Persistence().createEntityManagerFactory("com_xworkz").createEntityManager();
        MovieTicketDTO dto = entityManager.find(MovieTicketDTO.class,id);

        if (dto != null) {
            dto.setNoOfTickets(updatedNoOfTickets);
            entityManager.getTransaction().begin();
            entityManager.merge(dto);
            entityManager.getTransaction().commit();
            System.out.println("successfully updated no of tickets");
        }

    }

    @Override
    public void updateMovieNameById(String updatedMovieName, int id) {

        EntityManager entityManager = new Persistence().createEntityManagerFactory("com_xworkz").createEntityManager();
        MovieTicketDTO movieTicketDTO = entityManager.find(MovieTicketDTO.class,id);

        if(movieTicketDTO!=null) {
            movieTicketDTO.setMovieName(updatedMovieName);
            entityManager.getTransaction().begin();
            entityManager.merge(movieTicketDTO);
            entityManager.getTransaction().commit();
            System.out.println("successfully updated movie name");
        }
    }

    @Override
    public void deleteMovieInfoById(int id) {

        EntityManager entityManager = new Persistence().createEntityManagerFactory("com_xworkz").createEntityManager();
        MovieTicketDTO movieTicketDTO = entityManager.find(MovieTicketDTO.class,id);

        if(movieTicketDTO!=null){
            entityManager.getTransaction().begin();
            entityManager.remove(movieTicketDTO);
            entityManager.getTransaction().commit();
            System.out.println("movie info successfully deleted");
        }

    }

    @Override
    public List<MovieTicketDTO> findAll() {


        EntityManager entityManager= new Persistence().createEntityManagerFactory("com_xworkz").createEntityManager();
        Query q = entityManager.createNamedQuery("findAll");
        return q.getResultList();
    }

    @Override
    public MovieTicketDTO fetchBookingInfoByTheaterName(String theatreName) {
        if(theatreName!=null){
            return bookMyShowRepository.fetchBookingInfoByTheaterName(theatreName);
        }else {
            return null;
        }
    }


    @Override
    public boolean save(MovieTicketDTO dto) {

//        Persistence persistence = new Persistence();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com_xworkz");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityManager.getTransaction().begin();

        entityManager.persist(dto);
        entityManager.getTransaction().commit();

        return false;
    }

    @Override
    public boolean addMovieTicket(MovieTicketDTO dto) {

        Persistence persistence = new Persistence();

        EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("com_xworkz");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
        entityManager.close();

        return false;
    }


}
