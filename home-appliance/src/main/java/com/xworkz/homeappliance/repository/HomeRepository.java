package com.xworkz.homeappliance.repository;

import com.xworkz.homeappliance.dto.HomeApplianceDTo;

import java.util.List;

public interface HomeRepository {

    public  void save(HomeApplianceDTo dto);

    public List<HomeApplianceDTo> getLoginIdAndPassword(String loginId,String password);

    public List<HomeApplianceDTo> getHomeApplianceInfo();

    public HomeApplianceDTo validateAndGetById(int id);

    public void updateHomeInfo(HomeApplianceDTo dto, int id);

    public boolean deleteHomeInfoById(int id);}
