package com.xworkz.transportsystem.repository.Impl;

import com.xworkz.transportsystem.dto.TransportDTO;
import com.xworkz.transportsystem.repository.TransportRepository;
import com.xworkz.transportsystem.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.List;

public class TransportRepositoryImpl implements TransportRepository {
    @Override
    public void save(TransportDTO dto) {

        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public List<TransportDTO> getLoginIdAndPassword(String loginId, String password) {

        List<TransportDTO> dtoList = EntityManagerFactorySingleton.getFactory().createEntityManager().
                createNamedQuery("getLoign").setParameter("loginMail",loginId).setParameter("password",password).getResultList();

        return dtoList;
    }

    @Override
    public List<TransportDTO> getAllUsers() {

        List<TransportDTO> dtoList = EntityManagerFactorySingleton.getFactory().
                createEntityManager().createNamedQuery("getUsersList").getResultList();

        return dtoList;
    }

    @Override
    public TransportDTO validateAndGetById(int id) {

        TransportDTO transportDTO = (TransportDTO) EntityManagerFactorySingleton.getFactory().createEntityManager().
                createNamedQuery("validateById").setParameter("id",id).getSingleResult();

        return transportDTO;
    }

    @Override
    public void updateTransportInfo(TransportDTO dto, int id) {

        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        TransportDTO transportDTO = entityManager.find(TransportDTO.class,id);

        transportDTO.setUserName(dto.getUserName());
        transportDTO.setLoginId(dto.getLoginId());
        transportDTO.setPassword(dto.getPassword());
        transportDTO.setTransportName(dto.getTransportName());
        transportDTO.setStateName(dto.getStateName());
        transportDTO.setArrivalTime(dto.getArrivalTime());
        transportDTO.setDepartureTime(dto.getDepartureTime());

        entityManager.getTransaction().begin();
        entityManager.merge(transportDTO);
        entityManager.getTransaction().commit();

    }

    @Override
    public boolean deleteTransportInfo(int id) {

        boolean isDeleted = false;

        EntityManager entityManager =  EntityManagerFactorySingleton.getFactory().createEntityManager();
        TransportDTO dto = entityManager.find(TransportDTO.class,id);

        if(dto!=null) {
            entityManager.getTransaction().begin();
            entityManager.remove(dto);
            entityManager.getTransaction().commit();
            isDeleted = true;
        }
        return isDeleted;
    }
}
