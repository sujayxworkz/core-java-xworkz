package com.xworkz.homeappliance.repository.Impl;

import com.xworkz.homeappliance.dto.HomeApplianceDTo;
import com.xworkz.homeappliance.repository.HomeRepository;
import com.xworkz.homeappliance.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.List;

public class HomeRepositoryImpl implements HomeRepository {
    @Override
    public void save(HomeApplianceDTo dto) {

       EntityManager entityManager =  EntityManagerFactorySingleton.getFactory().createEntityManager();
       entityManager.getTransaction().begin();
       entityManager.persist(dto);
       entityManager.getTransaction().commit();

    }

    @Override
    public List<HomeApplianceDTo> getLoginIdAndPassword(String loginId, String password) {

        List<HomeApplianceDTo> dToList = EntityManagerFactorySingleton.getFactory().createEntityManager()
                .createNamedQuery("getLoginIdAndPassword").
                setParameter("loginMail",loginId).setParameter("password",password).getResultList();

        return dToList;
    }

    @Override
    public List<HomeApplianceDTo> getHomeApplianceInfo() {

        List<HomeApplianceDTo> dToList = EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("getUsers").getResultList();
        return dToList;

    }

    @Override
    public HomeApplianceDTo validateAndGetById(int id) {

        HomeApplianceDTo dTo = (HomeApplianceDTo) EntityManagerFactorySingleton.getFactory().createEntityManager().
                createNamedQuery("getById").setParameter("id",id).getSingleResult();

        return dTo;
    }

    @Override
    public void updateHomeInfo(HomeApplianceDTo dto, int id) {

        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        HomeApplianceDTo home = entityManager.find(HomeApplianceDTo.class,id);

        home.setUserName(dto.getUserName());
        home.setLoginId(dto.getLoginId());
        home.setPassword(dto.getPassword());
        home.setApplianceName(dto.getApplianceName());
        home.setMaterialType(dto.getMaterialType());

        entityManager.getTransaction().begin();
        entityManager.merge(home);
        entityManager.getTransaction().commit();

    }

    @Override
    public boolean deleteHomeInfoById(int id) {

        boolean isDeleted = false;

        if (id > 0) {
            EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
            HomeApplianceDTo dto = entityManager.find(HomeApplianceDTo.class, id);

            if (dto != null) {
                entityManager.getTransaction().begin();
                entityManager.remove(dto);
                entityManager.getTransaction().commit();
            }
        }

        return  isDeleted;
    }


}