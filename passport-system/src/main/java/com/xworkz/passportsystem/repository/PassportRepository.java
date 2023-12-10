package com.xworkz.passportsystem.repository;

import com.xworkz.passportsystem.dto.PassportDTO;

import java.util.List;

public interface PassportRepository {

    public void save(PassportDTO dto);

    public List<PassportDTO> getLoginIdAndPassword(String loginId, String password);

    public List<PassportDTO> getUsersInfo();

    public PassportDTO getUserById(int id);

    public void updatePassportInfo(PassportDTO dto,int id);

    public boolean deletePassportInfo(int id);


}
