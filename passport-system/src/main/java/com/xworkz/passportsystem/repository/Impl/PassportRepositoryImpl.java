package com.xworkz.passportsystem.repository.Impl;

import com.xworkz.passportsystem.dto.PassportDTO;
import com.xworkz.passportsystem.repository.PassportRepository;
import com.xworkz.passportsystem.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.List;

public class PassportRepositoryImpl implements PassportRepository {
    @Override
    public void save(PassportDTO dto) {

        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();

    }

    @Override
    public List<PassportDTO> getLoginIdAndPassword(String loginId, String password) {

        List<PassportDTO> dtoList = EntityManagerFactorySingleton.getFactory().
                createEntityManager().createNamedQuery("getLoginIdAndPassword")
                .setParameter("loginId",loginId).setParameter("password",password).getResultList();

        return dtoList;
    }

    @Override
    public List<PassportDTO> getUsersInfo() {

        List<PassportDTO> dtoList = EntityManagerFactorySingleton.getFactory().createEntityManager().
                createNamedQuery("getUsersList").getResultList();

        return dtoList;
    }

    @Override
    public PassportDTO getUserById(int id) {

        PassportDTO dto = (PassportDTO) EntityManagerFactorySingleton.getFactory().createEntityManager().
                createNamedQuery("getById").setParameter("id",id).getSingleResult();

        return dto;
    }

    @Override
    public void updatePassportInfo(PassportDTO dto,int id) {

        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        PassportDTO passportDTO = entityManager.find(PassportDTO.class,id);

        passportDTO.setPassportOfficeName(dto.getPassportOfficeName());
        passportDTO.setGivenName(dto.getGivenName());
        passportDTO.setSurName(dto.getSurName());
        passportDTO.setEmail(dto.getEmail());
        passportDTO.setLoginMail(dto.getLoginMail());
        passportDTO.setPassword(dto.getPassword());
        passportDTO.setConfirmPassword(dto.getConfirmPassword());
        passportDTO.setHintQuestionName(dto.getHintQuestionName());
        passportDTO.setHintAnswerName(dto.getHintAnswerName());

        entityManager.getTransaction().begin();
        entityManager.merge(passportDTO);
        entityManager.getTransaction().commit();

    }

    @Override
    public boolean deletePassportInfo(int id) {

        boolean isDeleted = false;
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        PassportDTO passportDTO  = entityManager.find(PassportDTO.class,id);

        entityManager.getTransaction().begin();
        entityManager.remove(passportDTO);
        entityManager.getTransaction().commit();
        isDeleted = true;

        return isDeleted;
    }
}
