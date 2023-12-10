package com.xworkz.homeappliance.service.Impl;

import com.xworkz.homeappliance.dto.HomeApplianceDTo;
import com.xworkz.homeappliance.repository.Impl.HomeRepositoryImpl;
import com.xworkz.homeappliance.service.HomeService;

import java.util.List;

public class HomeServiceImpl implements HomeService {

    HomeRepositoryImpl homeRepository;

    public HomeServiceImpl(){
        homeRepository = new HomeRepositoryImpl();
    }

    @Override
    public void validateAndSave(HomeApplianceDTo dto) {
        if(dto!=null){
         homeRepository.save(dto);
        }
    }

    @Override
    public List<HomeApplianceDTo> getLoginIdAndPassword(String loginId,String password) {

        return  homeRepository.getLoginIdAndPassword(loginId, password);


    }

    @Override
    public List<HomeApplianceDTo> getHomeApplianceInfo() {

        return homeRepository.getHomeApplianceInfo();
    }

    @Override
    public HomeApplianceDTo validateAndGetById(int id) {

        HomeApplianceDTo dTo = null;
        if(id>0){
            dTo = homeRepository.validateAndGetById(id);
        }

        return dTo;
    }

    @Override
    public void updateHomeInfo(HomeApplianceDTo dto, int id) {

        homeRepository.updateHomeInfo(dto, id);

    }

    @Override
    public boolean deleteHomeInfoById(int id) {

        boolean isDeleted = false;
        if(id>0){
            homeRepository.deleteHomeInfoById(id);
            isDeleted=true;
        }
        return  isDeleted;
    }


}
